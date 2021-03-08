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

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Unit test for simple App.
 */
@SuppressWarnings("checkstyle:magicnumber")
public class AppTest {

    private HeapSort hs = new HeapSort();

    /**
     * Ordena valores únicos.
     */
    @Test
    public void ordenaUnicos() {
        int[] ordenado = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] desordenado = {7, 9, 3, 10, 5, 6, 1, 8, 2, 4};
        hs.sort(desordenado);
        assertArrayEquals(ordenado, desordenado);
    }

    /**
     * Ordena sem valores.
     */
    @Test
    public void ordenaNulo() {
        int[] ordenado = {};
        int[] desordenado = {};
        hs.sort(desordenado);
        assertArrayEquals(ordenado, desordenado);
    }

    /**
     * Ordena com alguns valores repetidos.
     */
    @Test
    public void ordenaRepetidos() {
        int[] ordenado = {1, 2, 2, 2, 2, 6, 7, 8, 9, 10};
        int[] desordenado = {10, 7, 2, 1, 2, 6, 2, 8, 9, 2};
        hs.sort(desordenado);
        assertArrayEquals(ordenado, desordenado);
    }

    /**
     * Ordena incluindo valores negativos.
     */
    @Test
    public void ordenaComNegativos() {
        int[] ordenado = {-6, -3, 0, 1, 7, 8, 9, 10, 15, 17};
        int[] desordenado = {10, 8, 17, 0, 7, -3, 9, -6, 15, 1};
        hs.sort(desordenado);
        assertArrayEquals(ordenado, desordenado);
    }

    /**
     * Ordena com todos valores iguais.
     */
    @Test
    public void ordenaIguais() {
        int[] ordenado = {3, 3, 3, 3, 3, 3, 3, 3, 3, 3};
        int[] desordenado = {3, 3, 3, 3, 3, 3, 3, 3, 3, 3};
        hs.sort(desordenado);
        assertArrayEquals(ordenado, desordenado);
    }

    /**
     * Ordena um valor.
     */
    @Test
    public void ordenaUmValor() {
        int[] ordenado = {6};
        int[] desordenado = {6};
        hs.sort(desordenado);
        assertArrayEquals(ordenado, desordenado);
    }

}
