/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graphodev2;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author emir7
 */
public class Draww extends JPanel {

    LinkedList[] array;
    int[][] adj;

    int[] xValues;
    int[] yValues;
    int distance[];

    Draww(LinkedList[] array) {

        this.array = array;

        xValues = new int[array.length];
        yValues = new int[array.length];
        adj = new int[array.length][array.length];
        distance = new int[array.length];
    }

    public void paint(Graphics g) {

        Graphics2D g2 = (Graphics2D) g;

        int x = 100;
        int y = 100;

        int w = 0;

        for (int i = 0, j = 1; i < array.length; i++, j++) {

            xValues[i] = x + 17;
            yValues[i] = y + 30;

            if (j % 2 == 0) {

                y += 50;
            } else {
                y -= 50;
            }

            if (j % 4 == 0) {

                y += 200;
                x = 125;
            } else {

                x += 200;
            }

            if (j % 8 == 0) {

                x = 100;
            } else {

                x += 200;
            }
        }

        g2.setColor(Color.BLACK);
        for (int i = 0; i < array.length; i++) {

            Node tmp = array[i].head;
            char c = tmp.data;

            while (tmp.next != null) {

                tmp = tmp.next;

                for (int j = 0; j < array.length; j++) {

                    if (tmp.data == array[j].head.data) {

                        g2.drawLine(xValues[i], yValues[i], xValues[j], yValues[j]);
                        g2.drawString(String.valueOf(tmp.edge.weight), (xValues[i] + xValues[j]) / 2, (yValues[i] + yValues[j]) / 2);
                    }
                }
            }
        }

        for (int i = 0; i < array.length; i++) {

            g2.setColor(Color.PINK);
            g2.fillOval(xValues[i] - 17, yValues[i] - 30, 50, 50);

            g2.setColor(Color.white);
            g2.setFont(new Font("Serif", Font.BOLD, 20));
            g2.drawString(String.valueOf(array[i].head.data), xValues[i], yValues[i]);

        }
        
        adjMatrix();
        g2.setColor(Color.BLACK);
        g2.setFont(new Font("Serif", Font.BOLD, 15));
        int dY = 700;
        for (int i = 0; i < distance.length; i++) {
            
            int letter = i + 'A';
            if(distance[i] != Integer.MAX_VALUE){
            g2.drawString("Shortest way from A to " + (char)letter + " is: " + distance[i], 50, dY);
            dY += 17;
            }
        }
        
    }

    void adjMatrix() {

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length; j++) {
                adj[i][j] = 0;
            }
        }

        for (int i = 0; i < array.length; i++) {

            Node tmp = array[i].head;

            while (tmp.next != null) {
                tmp = tmp.next;
                int j = tmp.data - 'A';

                adj[i][j] = tmp.edge.weight;
            }
        }
        dijkstra();
    }

    void dijkstra() {

        int v = adj.length;
        boolean visited[] = new boolean[v];
        
        distance[0] = 0;

        for (int i = 1; i < v; i++) {
            distance[i] = Integer.MAX_VALUE;

        }

        for (int i = 0; i < v - 1; i++) {

            int minVertex = findMinVertex(distance, visited);
            visited[minVertex] = true;
            
            for (int j = 0; j < v; j++) {

                if (adj[minVertex][j] != 0 && !visited[j] && distance[minVertex] != Integer.MAX_VALUE) {

                    int newDist = distance[minVertex] + adj[minVertex][j];

                    if (newDist < distance[j]) {

                        distance[j] = newDist;
                    }

                }
            }
        }
        
        for (int i = 0; i < v; i++) {
            System.out.println(i + " " + distance[i]);
        }
        
    }

    int findMinVertex(int[] distance, boolean visited[]) {

        int minVertex = -1;
        for (int i = 0; i < distance.length; i++) {
            if (!visited[i] && (minVertex == -1 || distance[i] < distance[minVertex])) {

                minVertex = i;
            }
        }
        return minVertex;
    }

    void printDist() {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {

                System.out.print(adj[i][j] + " ");

            }
            System.out.println("");
        }

    }
}
