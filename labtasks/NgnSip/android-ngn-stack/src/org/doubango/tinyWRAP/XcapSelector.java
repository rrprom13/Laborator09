/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.doubango.tinyWRAP;

public class XcapSelector {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected XcapSelector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(XcapSelector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        tinyWRAPJNI.delete_XcapSelector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public XcapSelector(XcapStack stack) {
    this(tinyWRAPJNI.new_XcapSelector(XcapStack.getCPtr(stack), stack), true);
  }

  public XcapSelector setAUID(String auid) {
    long cPtr = tinyWRAPJNI.XcapSelector_setAUID(swigCPtr, this, auid);
    return (cPtr == 0) ? null : new XcapSelector(cPtr, false);
  }

  public XcapSelector setName(String qname) {
    long cPtr = tinyWRAPJNI.XcapSelector_setName(swigCPtr, this, qname);
    return (cPtr == 0) ? null : new XcapSelector(cPtr, false);
  }

  public XcapSelector setAttribute(String qname, String att_qname, String att_value) {
    long cPtr = tinyWRAPJNI.XcapSelector_setAttribute(swigCPtr, this, qname, att_qname, att_value);
    return (cPtr == 0) ? null : new XcapSelector(cPtr, false);
  }

  public XcapSelector setPos(String qname, long pos) {
    long cPtr = tinyWRAPJNI.XcapSelector_setPos(swigCPtr, this, qname, pos);
    return (cPtr == 0) ? null : new XcapSelector(cPtr, false);
  }

  public XcapSelector setPosAttribute(String qname, long pos, String att_qname, String att_value) {
    long cPtr = tinyWRAPJNI.XcapSelector_setPosAttribute(swigCPtr, this, qname, pos, att_qname, att_value);
    return (cPtr == 0) ? null : new XcapSelector(cPtr, false);
  }

  public XcapSelector setNamespace(String prefix, String value) {
    long cPtr = tinyWRAPJNI.XcapSelector_setNamespace(swigCPtr, this, prefix, value);
    return (cPtr == 0) ? null : new XcapSelector(cPtr, false);
  }

  public String getString() {
    return tinyWRAPJNI.XcapSelector_getString(swigCPtr, this);
  }

  public void reset() {
    tinyWRAPJNI.XcapSelector_reset(swigCPtr, this);
  }

}