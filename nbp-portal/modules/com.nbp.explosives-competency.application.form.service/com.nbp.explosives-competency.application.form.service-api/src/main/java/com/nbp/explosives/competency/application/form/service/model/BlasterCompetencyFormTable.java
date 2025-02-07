/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.explosives.competency.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_blaster_competency&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see BlasterCompetencyForm
 * @generated
 */
public class BlasterCompetencyFormTable
	extends BaseTable<BlasterCompetencyFormTable> {

	public static final BlasterCompetencyFormTable INSTANCE =
		new BlasterCompetencyFormTable();

	public final Column<BlasterCompetencyFormTable, Long>
		blasterCompetencyFormId = createColumn(
			"blasterCompetencyFormId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<BlasterCompetencyFormTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<BlasterCompetencyFormTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<BlasterCompetencyFormTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<BlasterCompetencyFormTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<BlasterCompetencyFormTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<BlasterCompetencyFormTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<BlasterCompetencyFormTable, String> firstName =
		createColumn(
			"firstName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<BlasterCompetencyFormTable, String> surName =
		createColumn(
			"surName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<BlasterCompetencyFormTable, String> middleName =
		createColumn(
			"middleName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<BlasterCompetencyFormTable, String> gender =
		createColumn(
			"gender", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<BlasterCompetencyFormTable, String> officeNumber =
		createColumn(
			"officeNumber", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<BlasterCompetencyFormTable, String> cellNum =
		createColumn(
			"cellNum", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<BlasterCompetencyFormTable, String> trnNum =
		createColumn(
			"trnNum", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<BlasterCompetencyFormTable, Date> dateOfBirth =
		createColumn(
			"dateOfBirth", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<BlasterCompetencyFormTable, String> address =
		createColumn(
			"address", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<BlasterCompetencyFormTable, String> educationalBack =
		createColumn(
			"educationalBack", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<BlasterCompetencyFormTable, String> blastingCourse =
		createColumn(
			"blastingCourse", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<BlasterCompetencyFormTable, String> state =
		createColumn(
			"state_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<BlasterCompetencyFormTable, String> nameOfCourse =
		createColumn(
			"nameOfCourse", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<BlasterCompetencyFormTable, String> courseOrganiser =
		createColumn(
			"courseOrganiser", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<BlasterCompetencyFormTable, Date> dateAppli =
		createColumn(
			"dateAppli", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<BlasterCompetencyFormTable, Long>
		explosivesApplicationId = createColumn(
			"explosivesApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private BlasterCompetencyFormTable() {
		super("nbp_blaster_competency", BlasterCompetencyFormTable::new);
	}

}