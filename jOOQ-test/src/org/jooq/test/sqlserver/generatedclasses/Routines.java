/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlserver.generatedclasses;

/**
 * This class is generated by jOOQ.
 *
 * Convenience access to all stored procedures and functions in dbo
 */
@java.lang.SuppressWarnings("all")
public final class Routines {

	/**
	 * Call <code>dbo.f_author_exists</code>
	 */
	public static java.lang.Integer fAuthorExists(org.jooq.Configuration configuration, java.lang.String authorName) {
		org.jooq.test.sqlserver.generatedclasses.routines.FAuthorExists f = new org.jooq.test.sqlserver.generatedclasses.routines.FAuthorExists();
		f.setAuthorName(authorName);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>dbo.f_author_exists</code> as a field
	 */
	public static org.jooq.Field<java.lang.Integer> fAuthorExists(java.lang.String authorName) {
		org.jooq.test.sqlserver.generatedclasses.routines.FAuthorExists f = new org.jooq.test.sqlserver.generatedclasses.routines.FAuthorExists();
		f.setAuthorName(authorName);

		return f.asField();
	}

	/**
	 * Get <code>dbo.f_author_exists</code> as a field
	 */
	public static org.jooq.Field<java.lang.Integer> fAuthorExists(org.jooq.Field<java.lang.String> authorName) {
		org.jooq.test.sqlserver.generatedclasses.routines.FAuthorExists f = new org.jooq.test.sqlserver.generatedclasses.routines.FAuthorExists();
		f.setAuthorName(authorName);

		return f.asField();
	}

	/**
	 * Call <code>dbo.f_number</code>
	 */
	public static java.lang.Integer fNumber(org.jooq.Configuration configuration, java.lang.Integer n) {
		org.jooq.test.sqlserver.generatedclasses.routines.FNumber f = new org.jooq.test.sqlserver.generatedclasses.routines.FNumber();
		f.setN(n);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>dbo.f_number</code> as a field
	 */
	public static org.jooq.Field<java.lang.Integer> fNumber(java.lang.Integer n) {
		org.jooq.test.sqlserver.generatedclasses.routines.FNumber f = new org.jooq.test.sqlserver.generatedclasses.routines.FNumber();
		f.setN(n);

		return f.asField();
	}

	/**
	 * Get <code>dbo.f_number</code> as a field
	 */
	public static org.jooq.Field<java.lang.Integer> fNumber(org.jooq.Field<java.lang.Integer> n) {
		org.jooq.test.sqlserver.generatedclasses.routines.FNumber f = new org.jooq.test.sqlserver.generatedclasses.routines.FNumber();
		f.setN(n);

		return f.asField();
	}

	/**
	 * Call <code>dbo.f_one</code>
	 */
	public static java.lang.Integer fOne(org.jooq.Configuration configuration) {
		org.jooq.test.sqlserver.generatedclasses.routines.FOne f = new org.jooq.test.sqlserver.generatedclasses.routines.FOne();

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>dbo.f_one</code> as a field
	 */
	public static org.jooq.Field<java.lang.Integer> fOne() {
		org.jooq.test.sqlserver.generatedclasses.routines.FOne f = new org.jooq.test.sqlserver.generatedclasses.routines.FOne();

		return f.asField();
	}

	/**
	 * Call <code>dbo.f317</code>
	 */
	public static java.lang.Integer f317(org.jooq.Configuration configuration, java.lang.Integer p1, java.lang.Integer p2, java.lang.Integer p3, java.lang.Integer p4) {
		org.jooq.test.sqlserver.generatedclasses.routines.F317 f = new org.jooq.test.sqlserver.generatedclasses.routines.F317();
		f.setP1(p1);
		f.setP2(p2);
		f.setP3(p3);
		f.setP4(p4);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>dbo.f317</code> as a field
	 */
	public static org.jooq.Field<java.lang.Integer> f317(java.lang.Integer p1, java.lang.Integer p2, java.lang.Integer p3, java.lang.Integer p4) {
		org.jooq.test.sqlserver.generatedclasses.routines.F317 f = new org.jooq.test.sqlserver.generatedclasses.routines.F317();
		f.setP1(p1);
		f.setP2(p2);
		f.setP3(p3);
		f.setP4(p4);

		return f.asField();
	}

	/**
	 * Get <code>dbo.f317</code> as a field
	 */
	public static org.jooq.Field<java.lang.Integer> f317(org.jooq.Field<java.lang.Integer> p1, org.jooq.Field<java.lang.Integer> p2, org.jooq.Field<java.lang.Integer> p3, org.jooq.Field<java.lang.Integer> p4) {
		org.jooq.test.sqlserver.generatedclasses.routines.F317 f = new org.jooq.test.sqlserver.generatedclasses.routines.F317();
		f.setP1(p1);
		f.setP2(p2);
		f.setP3(p3);
		f.setP4(p4);

		return f.asField();
	}

	/**
	 * Call <code>dbo.p_author_exists</code>
	 */
	public static java.lang.Integer pAuthorExists(org.jooq.Configuration configuration, java.lang.String authorName, java.lang.Integer result) {
		org.jooq.test.sqlserver.generatedclasses.routines.PAuthorExists p = new org.jooq.test.sqlserver.generatedclasses.routines.PAuthorExists();
		p.setAuthorName(authorName);
		p.setResult(result);

		p.execute(configuration);
		return p.getResult();
	}

	/**
	 * Call <code>dbo.p_create_author</code>
	 */
	public static void pCreateAuthor(org.jooq.Configuration configuration) {
		org.jooq.test.sqlserver.generatedclasses.routines.PCreateAuthor p = new org.jooq.test.sqlserver.generatedclasses.routines.PCreateAuthor();

		p.execute(configuration);
	}

	/**
	 * Call <code>dbo.p_create_author_by_name</code>
	 */
	public static void pCreateAuthorByName(org.jooq.Configuration configuration, java.lang.String firstName, java.lang.String lastName) {
		org.jooq.test.sqlserver.generatedclasses.routines.PCreateAuthorByName p = new org.jooq.test.sqlserver.generatedclasses.routines.PCreateAuthorByName();
		p.setFirstName(firstName);
		p.setLastName(lastName);

		p.execute(configuration);
	}

	/**
	 * Call <code>dbo.p_default</code>
	 */
	public static org.jooq.test.sqlserver.generatedclasses.routines.PDefault pDefault(org.jooq.Configuration configuration, java.lang.Integer pInNumber, java.lang.Integer pOutNumber, java.lang.String pInVarchar, java.lang.String pOutVarchar, java.sql.Date pInDate, java.sql.Date pOutDate) {
		org.jooq.test.sqlserver.generatedclasses.routines.PDefault p = new org.jooq.test.sqlserver.generatedclasses.routines.PDefault();
		p.setPInNumber(pInNumber);
		p.setPOutNumber(pOutNumber);
		p.setPInVarchar(pInVarchar);
		p.setPOutVarchar(pOutVarchar);
		p.setPInDate(pInDate);
		p.setPOutDate(pOutDate);

		p.execute(configuration);
		return p;
	}

	/**
	 * Call <code>dbo.p_unused</code>
	 */
	public static org.jooq.test.sqlserver.generatedclasses.routines.PUnused pUnused(org.jooq.Configuration configuration, java.lang.String in1, java.lang.Integer out1, java.lang.Integer out2) {
		org.jooq.test.sqlserver.generatedclasses.routines.PUnused p = new org.jooq.test.sqlserver.generatedclasses.routines.PUnused();
		p.setIn1(in1);
		p.setOut1(out1);
		p.setOut2(out2);

		p.execute(configuration);
		return p;
	}

	/**
	 * Call <code>dbo.p1490</code>
	 */
	public static void p1490(org.jooq.Configuration configuration, java.lang.Integer value) {
		org.jooq.test.sqlserver.generatedclasses.routines.P1490 p = new org.jooq.test.sqlserver.generatedclasses.routines.P1490();
		p.setValue(value);

		p.execute(configuration);
	}

	/**
	 * Call <code>dbo.p391</code>
	 */
	public static org.jooq.test.sqlserver.generatedclasses.routines.P391 p391(org.jooq.Configuration configuration, java.lang.Integer i1, java.lang.Integer io1, java.lang.Integer o1, java.lang.Integer o2, java.lang.Integer io2, java.lang.Integer i2) {
		org.jooq.test.sqlserver.generatedclasses.routines.P391 p = new org.jooq.test.sqlserver.generatedclasses.routines.P391();
		p.setI1(i1);
		p.setIo1(io1);
		p.setO1(o1);
		p.setO2(o2);
		p.setIo2(io2);
		p.setI2(i2);

		p.execute(configuration);
		return p;
	}

	/**
	 * No further instances allowed
	 */
	private Routines() {}
}
