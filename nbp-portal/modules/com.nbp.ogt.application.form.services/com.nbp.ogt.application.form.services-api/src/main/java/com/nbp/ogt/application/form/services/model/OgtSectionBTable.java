/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ogt.application.form.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_ogt_section_b&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see OgtSectionB
 * @generated
 */
public class OgtSectionBTable extends BaseTable<OgtSectionBTable> {

	public static final OgtSectionBTable INSTANCE = new OgtSectionBTable();

	public final Column<OgtSectionBTable, Long> ogtSectionBId = createColumn(
		"ogtSectionBId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<OgtSectionBTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OgtSectionBTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OgtSectionBTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OgtSectionBTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OgtSectionBTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OgtSectionBTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OgtSectionBTable, String> theDebtor = createColumn(
		"theDebtor", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OgtSectionBTable, String> name = createColumn(
		"name", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OgtSectionBTable, Date> dateOfInsolvencyOfDebtor =
		createColumn(
			"dateOfInsolvencyOfDebtor", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<OgtSectionBTable, String> totalValueOfClaim =
		createColumn(
			"totalValueOfClaim", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OgtSectionBTable, String> statementOfAccount =
		createColumn(
			"statementOfAccount", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OgtSectionBTable, String> unsecuredClaim = createColumn(
		"unsecuredClaim", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OgtSectionBTable, String> unsecuredClaimOf =
		createColumn(
			"unsecuredClaimOf", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OgtSectionBTable, String> regardingTheAmount =
		createColumn(
			"regardingTheAmount", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OgtSectionBTable, String> categoryOne = createColumn(
		"categoryOne", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OgtSectionBTable, String> categoryTwo = createColumn(
		"categoryTwo", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OgtSectionBTable, String> categoryThree = createColumn(
		"categoryThree", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OgtSectionBTable, String> categoryFour = createColumn(
		"categoryFour", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OgtSectionBTable, String> otherPleaseSpecify =
		createColumn(
			"otherPleaseSpecify", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OgtSectionBTable, String> securedClaim = createColumn(
		"securedClaim", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OgtSectionBTable, String> securedClaimOf = createColumn(
		"securedClaimOf", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OgtSectionBTable, String> description = createColumn(
		"description", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OgtSectionBTable, String> relationWithDebtor =
		createColumn(
			"relationWithDebtor", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OgtSectionBTable, String> bankruptcyEventDescription =
		createColumn(
			"bankruptcyEventDescription", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OgtSectionBTable, String> bankruptcyOfAnIndividual =
		createColumn(
			"bankruptcyOfAnIndividual", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OgtSectionBTable, Long> ogtApplicationId = createColumn(
		"ogtApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private OgtSectionBTable() {
		super("nbp_ogt_section_b", OgtSectionBTable::new);
	}

}