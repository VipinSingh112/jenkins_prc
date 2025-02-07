/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_jtb_acco_gen_dec&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AccoGenDeclaration
 * @generated
 */
public class AccoGenDeclarationTable
	extends BaseTable<AccoGenDeclarationTable> {

	public static final AccoGenDeclarationTable INSTANCE =
		new AccoGenDeclarationTable();

	public final Column<AccoGenDeclarationTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccoGenDeclarationTable, Long> accoGenDeclarationId =
		createColumn(
			"accoGenDeclarationId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AccoGenDeclarationTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccoGenDeclarationTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccoGenDeclarationTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccoGenDeclarationTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccoGenDeclarationTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AccoGenDeclarationTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AccoGenDeclarationTable, String> noOfBedroom =
		createColumn(
			"noOfBedroom", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccoGenDeclarationTable, String> ownerOfHotel =
		createColumn(
			"ownerOfHotel", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccoGenDeclarationTable, String> addressOne =
		createColumn(
			"addressOne", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccoGenDeclarationTable, String> compIncorporatedOne =
		createColumn(
			"compIncorporatedOne", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccoGenDeclarationTable, Date> companyDate =
		createColumn(
			"companyDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AccoGenDeclarationTable, String> hotelOperator =
		createColumn(
			"hotelOperator", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccoGenDeclarationTable, Date> hotelOperatorDateSince =
		createColumn(
			"hotelOperatorDateSince", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<AccoGenDeclarationTable, String> addressTwo =
		createColumn(
			"addressTwo", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccoGenDeclarationTable, String> compIncorporatedTwo =
		createColumn(
			"compIncorporatedTwo", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccoGenDeclarationTable, String> hotelOperatorName =
		createColumn(
			"hotelOperatorName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccoGenDeclarationTable, Date> dateTwo = createColumn(
		"dateTwo", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AccoGenDeclarationTable, Date> hotelIncepDate =
		createColumn(
			"hotelIncepDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AccoGenDeclarationTable, String> financeOfOper =
		createColumn(
			"financeOfOper", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccoGenDeclarationTable, String> noOfEmployee =
		createColumn(
			"noOfEmployee", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccoGenDeclarationTable, Date> signatureDate =
		createColumn(
			"signatureDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AccoGenDeclarationTable, String> nameOfManager =
		createColumn(
			"nameOfManager", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccoGenDeclarationTable, Long> jtbApplicationId =
		createColumn(
			"jtbApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private AccoGenDeclarationTable() {
		super("nbp_jtb_acco_gen_dec", AccoGenDeclarationTable::new);
	}

}