package com.gaolei.mvvm.databinding;
import com.gaolei.mvvm.R;
import com.gaolei.mvvm.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentKnowledgeBindingImpl extends FragmentKnowledgeBinding implements com.gaolei.mvvm.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.EditText mboundView4;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener mboundView4androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of item.knowledgeContent
            //         is item.setKnowledgeContent((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView4);
            // localize variables for thread safety
            // item
            com.gaolei.mvvm.model.KnowledgeItem item = mItem;
            // item != null
            boolean itemJavaLangObjectNull = false;
            // item.knowledgeContent
            java.lang.String itemKnowledgeContent = null;



            itemJavaLangObjectNull = (item) != (null);
            if (itemJavaLangObjectNull) {




                item.setKnowledgeContent(((java.lang.String) (callbackArg_0)));
            }
        }
    };

    public FragmentKnowledgeBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private FragmentKnowledgeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[2]
            );
        this.avatar.setTag(null);
        this.content.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.EditText) bindings[4];
        this.mboundView4.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.gaolei.mvvm.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.item == variableId) {
            setItem((com.gaolei.mvvm.model.KnowledgeItem) variable);
        }
        else if (BR.eventlistener == variableId) {
            setEventlistener((com.gaolei.mvvm.fragment.KnowledgeFragment.EventListener) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItem(@Nullable com.gaolei.mvvm.model.KnowledgeItem Item) {
        updateRegistration(0, Item);
        this.mItem = Item;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.item);
        super.requestRebind();
    }
    public void setEventlistener(@Nullable com.gaolei.mvvm.fragment.KnowledgeFragment.EventListener Eventlistener) {
        this.mEventlistener = Eventlistener;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.eventlistener);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeItem((com.gaolei.mvvm.model.KnowledgeItem) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItem(com.gaolei.mvvm.model.KnowledgeItem Item, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.imgUrl) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        else if (fieldId == BR.knowledgeContent) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        else if (fieldId == BR.praiseCount) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.gaolei.mvvm.model.KnowledgeItem item = mItem;
        com.gaolei.mvvm.fragment.KnowledgeFragment.EventListener eventlistener = mEventlistener;
        java.lang.String itemImgUrl = null;
        int itemPraiseCount = 0;
        java.lang.String itemKnowledgeContent = null;
        java.lang.String itemPraiseCountJavaLangString = null;

        if ((dirtyFlags & 0x3dL) != 0) {


            if ((dirtyFlags & 0x25L) != 0) {

                    if (item != null) {
                        // read item.imgUrl
                        itemImgUrl = item.getImgUrl();
                    }
            }
            if ((dirtyFlags & 0x31L) != 0) {

                    if (item != null) {
                        // read item.praiseCount
                        itemPraiseCount = item.getPraiseCount();
                    }


                    // read (item.praiseCount) + ("")
                    itemPraiseCountJavaLangString = (itemPraiseCount) + ("");
            }
            if ((dirtyFlags & 0x29L) != 0) {

                    if (item != null) {
                        // read item.knowledgeContent
                        itemKnowledgeContent = item.getKnowledgeContent();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x25L) != 0) {
            // api target 1

            com.gaolei.mvvm.binding.ImageViewAttrAdapter.jloadImage(this.avatar, itemImgUrl);
        }
        if ((dirtyFlags & 0x29L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.content, itemKnowledgeContent);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, itemKnowledgeContent);
        }
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            this.mboundView3.setOnClickListener(mCallback1);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView4, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView4androidTextAttrChanged);
        }
        if ((dirtyFlags & 0x31L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, itemPraiseCountJavaLangString);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // eventlistener
        com.gaolei.mvvm.fragment.KnowledgeFragment.EventListener eventlistener = mEventlistener;
        // eventlistener != null
        boolean eventlistenerJavaLangObjectNull = false;



        eventlistenerJavaLangObjectNull = (eventlistener) != (null);
        if (eventlistenerJavaLangObjectNull) {



            eventlistener.clickPraise(callbackArg_0);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): item
        flag 1 (0x2L): eventlistener
        flag 2 (0x3L): item.imgUrl
        flag 3 (0x4L): item.knowledgeContent
        flag 4 (0x5L): item.praiseCount
        flag 5 (0x6L): null
    flag mapping end*/
    //end
}