/*******************************************************************************
 * Copyright  2016  Department of Biomedical Informatics, University of Utah
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package edu.utah.bmi.nlp.RuSH;

import edu.utah.bmi.nlp.core.Span;
import org.junit.Test;

import java.util.TreeSet;

/**
 * @Author Jianlin Shi
 */
public class TestSpan {
    @Test
    public void test() {
        Span a = new Span(0, 1);
        Span b = new Span(0, 2);
        System.out.println(a == b);
        TreeSet<Span> set = new TreeSet<Span>();
        set.add(a);
        set.add(b);
        set.add(new Span(1, 3));
        System.out.println(set.size());
        for (Span sp : set)
            System.out.println(sp.begin + "-" + sp.end);
        set.add(new Span(1, 2));
        System.out.println(set.size());
        for (Span sp : set)
            System.out.println(sp.begin + "-" + sp.end);
        set.add(new Span(2, 3));
        System.out.println(set.size());
        for (Span sp : set)
            System.out.println(sp.begin + "-" + sp.end);


    }
}
