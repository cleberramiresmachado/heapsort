/**
 * @License
 * Copyright 2021 Heap Sort Application
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 * https://pt.wikipedia.org/wiki/Heapsort
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package edu.ifrs.vvs;

import java.util.Scanner;

/**
 * Heap Sort.
 */
public class HeapSort {

    private Scanner scanner = new Scanner(System.in);

    /**
     * Método que ordena um vetor de inteiros utilizando o algoritmo de Heap Sort.
     *
     * @param v - Vetor que será ordenado.
     */
    public void sort(int... v) {
        /**
         * While utilizado para ordenar o vetor
         */
        int tamanho = v.length;
        int i = tamanho / 2;
        int pai = 0;
        int filho = 0;
        int t = 0;
        while (true) {
            if (i > 0) {
                i--;
                t = v[i];
            } else {
                tamanho--;
                if (tamanho <= 0) {
                    return;
                }
                t = v[tamanho];
                v[tamanho] = v[0];
            }
            pai = i;
            filho = (i * 2) + 1;
            while (filho < tamanho) {
                if ((filho + 1 < tamanho) && (v[filho + 1] > v[filho])) {
                    filho++;
                }
                if (v[filho] > t) {
                    v[pai] = v[filho];
                    pai = filho;
                    filho = pai * 2 + 1;
                } else {
                    break;
                }
            }
            v[pai] = t;
        }
    }

    /**
     * Reads the values.
     *
     * @return array of int
     */
    public int[] read() {
        int size = this.size();
        int[] values = new int[size];
        for (int i = 0; i < values.length; i++) {
            System.out.print("Value " + i + ": ");
            values[i] = Integer.valueOf(this.scanner.next());
        }
        return values;
    }

    /**
     * Reads the size of the array.
     *
     * @return the size of the array
     */
    private int size() {
        System.out.print("Size of array: ");
        int size = Integer.valueOf(this.scanner.next());
        return size;
    }

    /**
     * Shows the array.
     *
     * @param values the array
     */
    public void show(int... values) {
        for (int num : values) {
            System.out.print(num + " ");
        }
    }
}
