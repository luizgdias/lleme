package uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs;

/**
 * corbaObjects/scs/ComponentNotFound.java . Generated by the IDL-to-Java
 * compiler (portable), version "3.2" from deployment.idl Sexta-feira, 9 de
 * Dezembro de 2005 18h26min28s BRST
 */

@SuppressWarnings("serial")
public final class ComponentNotFound extends org.omg.CORBA.UserException {

	public ComponentNotFound() {
		super(ComponentNotFoundHelper.id());
	} // ctor

	public ComponentNotFound(String $reason) {
		super(ComponentNotFoundHelper.id() + "  " + $reason);
	} // ctor

} // class ComponentNotFound