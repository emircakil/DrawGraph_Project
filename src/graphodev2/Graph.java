package graphodev2;

import javax.swing.JFrame;

public class Graph extends javax.swing.JFrame {

    LinkedList[] array;
    int graphSize;

    public Graph() {
        initComponents();
    }

    void initializeGraph() {

        String vertexStr = "";
        array = new LinkedList[graphSize];

        for (int i = 0; i < graphSize; i++) {

            array[i] = new LinkedList();
        }

        int letter = 'A';

        for (int i = 0; i < graphSize; i++) {

            vertexStr += String.valueOf((char) letter) + " / ";
            array[i].addNode((char) letter);
            letter++;

        }

        vertexesLabel.setText("Vertexes: " + vertexStr);

    }

    void addEdge(int vertex1, int vertex2, int weight) {

        Edge edge = new Edge(vertex1, vertex2, weight);
        
        Node tmp = array[vertex1].head;
        
        while(tmp.next != null){
        
            tmp = tmp.next;
        }
        
        tmp.next = new Node(array[vertex2].head.data);
        tmp.next.edge = edge;
        
        
        tmp = array[vertex2].head;
        while(tmp.next != null){
        
            tmp = tmp.next;
        }
        
        tmp.next = new Node(array[vertex1].head.data);
        tmp.next.edge = edge;
        
    }

    void printArray() {

        for (int i = 0; i < graphSize; i++) {

            Node tmp = array[i].head;

            while (tmp != null) {

                System.out.print(tmp.data + " -> ");
                tmp = tmp.next;
            }
            System.out.println("");
        }
        System.out.println("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        graphSizeTF = new java.awt.TextField();
        label1 = new java.awt.Label();
        button1 = new java.awt.Button();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        vertex1TF = new java.awt.TextField();
        connectTwoVertex = new java.awt.Button();
        vertex2TF = new java.awt.TextField();
        vertexesLabel = new java.awt.Label();
        label4 = new java.awt.Label();
        weightTF = new java.awt.TextField();
        printArrayBut = new java.awt.Button();
        drawButton = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        label1.setText("Graph Size:");

        button1.setLabel("CreateGraph");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        label2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        label2.setText("Vertex1: ");

        label3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        label3.setText("Vertex2: ");

        connectTwoVertex.setActionCommand("addEdgeBut");
        connectTwoVertex.setLabel("Add Edge");
        connectTwoVertex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connectTwoVertexActionPerformed(evt);
            }
        });

        vertexesLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        vertexesLabel.setText("Vertexes: ");

        label4.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        label4.setText("Weight:");

        printArrayBut.setLabel("PrintArray");
        printArrayBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printArrayButActionPerformed(evt);
            }
        });

        drawButton.setLabel("Draw Graph");
        drawButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drawButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(printArrayBut, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(drawButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(vertexesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(vertex2TF, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(46, 46, 46)
                                    .addComponent(vertex1TF, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(graphSizeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(connectTwoVertex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(weightTF, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(graphSizeTF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(weightTF, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(connectTwoVertex, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(vertex1TF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(label4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vertex2TF, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(99, 99, 99)
                .addComponent(vertexesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(printArrayBut, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(drawButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        graphSize = Integer.parseInt(graphSizeTF.getText());
        initializeGraph();
        printArray();
    }//GEN-LAST:event_button1ActionPerformed

    private void connectTwoVertexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connectTwoVertexActionPerformed
        // TODO add your handling code here:
        int weight = Integer.parseInt(weightTF.getText());
        char vertex1 = vertex1TF.getText().charAt(0);
        char vertex2 = vertex2TF.getText().charAt(0);

        int v1Index = -1;
        int v2Index = -1;

        for (int i = 0; i < graphSize; i++) {

            if (array[i].head.data == vertex1) {
                v1Index = i;
            }

            if (array[i].head.data == vertex2) {
                v2Index = i;
            }

        }
        if (v1Index == -1 || v2Index == -1) {

            System.out.println("Vertex not found");
        } else {

            addEdge(v1Index, v2Index, weight);

        }
    }//GEN-LAST:event_connectTwoVertexActionPerformed

    private void printArrayButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printArrayButActionPerformed
        // TODO add your handling code here:
        printArray();
    }//GEN-LAST:event_printArrayButActionPerformed

    private void drawButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drawButtonActionPerformed
        // TODO add your handling code here:
        
        Draww panel = new Draww(array);
        JFrame jf = new JFrame();

        jf.add(panel);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // jf.setLocationRelativeTo(null);
        jf.setSize(1800, 900);
        jf.setVisible(true);
        
       
        
    }//GEN-LAST:event_drawButtonActionPerformed

    public static void main(String args[]) {

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Graph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Graph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Graph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Graph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Graph().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private java.awt.Button connectTwoVertex;
    private java.awt.Button drawButton;
    private java.awt.TextField graphSizeTF;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Button printArrayBut;
    private java.awt.TextField vertex1TF;
    private java.awt.TextField vertex2TF;
    private java.awt.Label vertexesLabel;
    private java.awt.TextField weightTF;
    // End of variables declaration//GEN-END:variables
}
