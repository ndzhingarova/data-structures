package linkedlist;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListTest {

    @Test
    void deleteByKeyEmptyList() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.deleteByKey(5);

        assertEquals(0, myLinkedList.size());
    }

    @ParameterizedTest
    @CsvSource({"11,5,1","11,11,0"})
    void deleteByKeyOneElementList(int insertValue, int deleteValue, int expectedSize) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.insert(insertValue);
        myLinkedList.deleteByKey(deleteValue);

        assertEquals(expectedSize, myLinkedList.size());
    }

    @ParameterizedTest
    @CsvSource({"11,5,11,1", "11,5,5,1"})
    void deleteByKeyTwoElementsList(int insertValue1, int insertValue2, int deleteValue, int expectedSize) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.insert(insertValue1);
        myLinkedList.insert(insertValue2);
        myLinkedList.deleteByKey(deleteValue);

        assertEquals(expectedSize, myLinkedList.size());
    }

    @ParameterizedTest
    @CsvSource({"2,9", "5,9", "11,9", "15,10"})
    void deleteByKeyList(int deleteValue, int expectedSize) {
        MyLinkedList myLinkedList = new MyLinkedList();
        for (int i = 0; i < 10; i++) {
            myLinkedList.insert(i+2);
        }
        myLinkedList.deleteByKey(deleteValue);

        assertEquals(expectedSize, myLinkedList.size());
    }
}