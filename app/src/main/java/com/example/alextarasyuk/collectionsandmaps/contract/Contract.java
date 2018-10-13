package com.example.alextarasyuk.collectionsandmaps.contract;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

public interface Contract {
    interface View {
        public void setTvInsertAtBeginningArrayList(String valueOfCalculation);

        public void setTvInsertAtMiddleArrayList(String valueOfCalculation);


        public void setTvInsertAtEndArrayList(String valueOfCalculation);


        public void setTvFindElementArrayList(String valueOfCalculation);


        public void setTvDeleteFirstArrayList(String valueOfCalculation);

        public void setTvDeleteMiddle(String valueOfCalculation);

        public void setTvDeleteLastElementArrayList(String valueOfCalculation);

        public void setTvInsertAtBeginningLinkedList(String valueOfCalculation);

        public void setTvInsertAtMiddleLinkList(String valueOfCalculation);

        public void setTvInsertAtEndLinkList(String valueOfCalculation);

        public void setTvFindElementLinkList(String valueOfCalculation);

        public void setTvDeleteFirstLinkList(String valueOfCalculation);

        public void setTvDeleteMiddleLinkList(String valueOfCalculation);

        public void setTvDeleteLastLinkList(String valueOfCalculation);

        public void setTvInsertAtBeginningCopyOnWriteList(String valueOfCalculation);

        public void setTvInsertAtMiddleCopyOnWriteList(String valueOfCalculation);

        public void setTvInsertAtEndCopyOnWriteList(String valueOfCalculation);

        public void setTvFindElementCopyOnWriteList(String valueOfCalculation);

        public void setTvDeleteFirstCopyOnWriteList(String valueOfCalculation);

        public void setTvDeleteMiddleCopyOnWriteList(String valueOfCalculation);

        public void setTvDeleteLastCopyOnWriteList(String valueOfCalculation);

        public void setAddNewInHashMap(String value);

        public void setSelectInHashMap(String value);

        public void setRemoveInHashMap(String value);

        public void setAddNewInTreeMap(String value);

        public void setSelectInTreeMap(String value);

        public void setRemoveInTreeMap(String value);
    }

    interface MapPresenter {
        void attachView(View view);

        void detachView();

        public void calculateAddNewElementToHashMap();

        public void calculateFindElementInHashMapByKey();

        public void calculateRemoveElementInHashMapByKey();

        public void calculateAddNewElementToTreeMap();

        public void calculateFindElementInTreeMapByKey();

        public void calculateRemoveElementInTreeMapByKey();

        void initializeMap(Integer size);
    }

    interface Presenter {
        void initialzeList(Integer size);

        void loadSizeOfLists(int number);


        public void setTvInsertAtBeginningArrayList();

        public void setTvInsertAtMiddleArrayList();


        public void setTvInsertAtEndArrayList();


        void setTvFindElementArrayList();

        public void setTvDeleteFirstArrayList();

        public void setTvDeleteMiddle();

        public void setTvDeleteLastElementArrayList();

        public void setTvInsertAtBeginningLinkedList();

        public void setTvInsertAtMiddleLinkList();

        public void setTvInsertAtEndLinkList();

        public void setTvFindElementLinkList();

        public void setTvDeleteFirstLinkList();

        public void setTvDeleteMiddleLinkList();

        public void setTvDeleteLastLinkList();

        public void setTvInsertAtBeginningCopyOnWriteList();

        public void setTvInsertAtMiddleCopyOnWriteList();

        public void setTvInsertAtEndCopyOnWriteList();

        public void setTvFindElementCopyOnWriteList();

        public void setTvDeleteFirstCopyOnWriteList();

        public void setTvDeleteMiddleCopyOnWriteList();

        public void setTvDeleteLastCopyOnWriteList();

        void attachView(View view);

        void detachView();
    }

    interface ListModel {
        String calculateInsertAtTheBeginning(List<Integer> list) throws ExecutionException, InterruptedException;

        String calculateInsertAtTheMiddle(List<Integer> list) throws ExecutionException, InterruptedException;

        String calculateInsertAtTheEnd(List<Integer> list) throws ExecutionException, InterruptedException;

        String calculateFindTheIndexOfElement(List<Integer> list) throws ExecutionException, InterruptedException;

        String calculateRemoveFirstElement(List<Integer> list) throws ExecutionException, InterruptedException;

        String calculateRemoveMiddleElementArrayList(List<Integer> list) throws ExecutionException, InterruptedException;

        String calculateRemoveLastElement(List<Integer> list) throws ExecutionException, InterruptedException;


    }


    public interface MapModel {

        public String calculateAddNewElementToMap(Map<Integer, Integer> treeMap) throws ExecutionException, InterruptedException;

        public String calculateFindElementInMapByKey(Map<Integer, Integer> treeMap) throws ExecutionException, InterruptedException;

        public String calculateRemoveElementInMapByKey(Map<Integer, Integer> treeMap) throws ExecutionException, InterruptedException;
    }
}