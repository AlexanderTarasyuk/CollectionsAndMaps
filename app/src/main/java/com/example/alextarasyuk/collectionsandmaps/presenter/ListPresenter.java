package com.example.alextarasyuk.collectionsandmaps.presenter;


import com.example.alextarasyuk.collectionsandmaps.contract.Contract;
import com.example.alextarasyuk.collectionsandmaps.model.ListCalculation;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;


public final class ListPresenter implements Contract.Presenter {

    private static volatile ListPresenter listPresenter;
    private Contract.View view;
    private Contract.ListModel model;

    private List<Integer> arrayList;
    private List<Integer> linkedList;
    private List<Integer> writeOnWriteLinkedList;

    private ListPresenter() {
        model = ListCalculation.getListCalculationSingleton();
    }

    public static ListPresenter getListPresenterSingleton() {

        if (listPresenter == null) {
            synchronized (ListPresenter.class) {
                listPresenter = new ListPresenter();

            }
        }
        return listPresenter;
    }

    public Contract.View getView() {
        return view;
    }


    @Override
    public void setTvInsertAtBeginningArrayList() {
        if (view != null & model != null) {
            try {
                view.setTvInsertAtBeginningArrayList(model.calculateInsertAtTheBeginning(arrayList));
            } catch (ExecutionException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void setTvInsertAtMiddleArrayList() {
        if (view != null & model != null) {
            try {
                view.setTvInsertAtMiddleArrayList(model.calculateInsertAtTheMiddle(arrayList));
            } catch (ExecutionException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    @Override
    public void setTvInsertAtEndArrayList() {
        if (view != null & model != null) {
            try {
                view.setTvInsertAtEndArrayList(model.calculateInsertAtTheEnd(arrayList));
            } catch (ExecutionException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    @Override
    public void setTvFindElementArrayList() {
        if (view != null & model != null) {
            try {
                view.setTvFindElementArrayList(model.calculateFindTheIndexOfElement(arrayList));
            } catch (ExecutionException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void setTvDeleteFirstArrayList() {
        if (view != null & model != null) {
            try {
                view.setTvDeleteFirstArrayList(model.calculateRemoveFirstElement(arrayList));
            } catch (ExecutionException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void setTvDeleteMiddle() {
        if (view != null & model != null) {
            try {
                view.setTvDeleteMiddle(model.calculateRemoveMiddleElementArrayList(arrayList));
            } catch (ExecutionException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    public void setTvDeleteLastElementArrayList() {
        if (view != null & model != null) {
            try {
                view.setTvDeleteLastElementArrayList(model.calculateRemoveLastElement(arrayList));
            } catch (ExecutionException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void setTvInsertAtBeginningLinkedList() {
        if (view != null & model != null) {
            try {
                view.setTvInsertAtBeginningLinkedList(model.calculateInsertAtTheBeginning(linkedList));
            } catch (ExecutionException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    public void setTvInsertAtMiddleLinkList() {
        if (view != null & model != null) {
            try {
                view.setTvInsertAtMiddleLinkList(model.calculateInsertAtTheMiddle(linkedList));
            } catch (ExecutionException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void setTvInsertAtEndLinkList() {
        if (view != null & model != null) {
            try {
                view.setTvInsertAtEndLinkList(model.calculateInsertAtTheEnd(linkedList));
            } catch (ExecutionException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void setTvFindElementLinkList() {
        if (view != null & model != null) {
            try {
                view.setTvFindElementLinkList(model.calculateFindTheIndexOfElement(linkedList));
            } catch (ExecutionException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void setTvDeleteFirstLinkList() {
        if (view != null & model != null) {
            try {
                view.setTvDeleteFirstLinkList(model.calculateRemoveFirstElement(linkedList));
            } catch (ExecutionException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void setTvDeleteMiddleLinkList() {
        if (view != null & model != null) {
            try {
                view.setTvDeleteMiddleLinkList(model.calculateRemoveMiddleElementArrayList(linkedList));
            } catch (ExecutionException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void setTvDeleteLastLinkList() {
        if (view != null & model != null) {
            try {
                view.setTvDeleteLastLinkList(model.calculateRemoveLastElement(linkedList));
            } catch (ExecutionException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void setTvInsertAtBeginningCopyOnWriteList() {
        if (view != null & model != null) {
            try {
                view.setTvInsertAtBeginningCopyOnWriteList(model.calculateInsertAtTheBeginning(writeOnWriteLinkedList));
            } catch (ExecutionException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    public void setTvInsertAtMiddleCopyOnWriteList() {
        if (view != null & model != null) {
            try {
                view.setTvInsertAtMiddleCopyOnWriteList(model.calculateInsertAtTheMiddle(writeOnWriteLinkedList));
            } catch (ExecutionException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    public void setTvInsertAtEndCopyOnWriteList() {
        if (view != null & model != null) {
            try {
                view.setTvInsertAtEndCopyOnWriteList(model.calculateInsertAtTheEnd(writeOnWriteLinkedList));
            } catch (ExecutionException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    public void setTvFindElementCopyOnWriteList() {
        if (view != null & model != null) {
            try {
                view.setTvFindElementCopyOnWriteList(model.calculateFindTheIndexOfElement(writeOnWriteLinkedList));
            } catch (ExecutionException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void setTvDeleteFirstCopyOnWriteList() {
        if (view != null & model != null) {
            try {
                view.setTvDeleteFirstCopyOnWriteList(model.calculateRemoveFirstElement(writeOnWriteLinkedList));
            } catch (ExecutionException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    public void setTvDeleteMiddleCopyOnWriteList() {
        if (view != null & model != null) {
            try {
                view.setTvDeleteMiddleCopyOnWriteList(model.calculateRemoveMiddleElementArrayList(writeOnWriteLinkedList));
            } catch (ExecutionException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    public void setTvDeleteLastCopyOnWriteList() {
        if (view != null & model != null) {
            try {
                view.setTvDeleteLastCopyOnWriteList(model.calculateRemoveMiddleElementArrayList(writeOnWriteLinkedList));
            } catch (ExecutionException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    public void initialzeList(Integer size) {

        Random random = new Random();
        arrayList = new ArrayList<>();
        linkedList = new LinkedList<>();
        writeOnWriteLinkedList = new CopyOnWriteArrayList<>();

        for (int i = 0; i < size; i++) {
            arrayList.add(random.nextInt(100_000));
            linkedList.add(random.nextInt(100_000));
            writeOnWriteLinkedList.add(random.nextInt(100_000));
        }

    }

    @Override
    public void loadSizeOfLists(int number) {
        initialzeList(number);


    }


    @Override
    public void attachView(Contract.View view) {
        this.view = view;


    }

    @Override
    public void detachView() {
        view = null;
        model = null;

    }

}
