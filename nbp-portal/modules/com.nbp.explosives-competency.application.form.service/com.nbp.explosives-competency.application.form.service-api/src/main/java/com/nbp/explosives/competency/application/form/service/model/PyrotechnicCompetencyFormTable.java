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
 * The table class for the &quot;nbp_pyrotechnic_competency&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see PyrotechnicCompetencyForm
 * @generated
 */
public class PyrotechnicCompetencyFormTable
	extends BaseTable<PyrotechnicCompetencyFormTable> {

	public static final PyrotechnicCompetencyFormTable INSTANCE =
		new PyrotechnicCompetencyFormTable();

	public final Column<PyrotechnicCompetencyFormTable, Long>
		pyrotechnicCompetencyFormId = createColumn(
			"pyrotechnicCompetencyFormId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<PyrotechnicCompetencyFormTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PyrotechnicCompetencyFormTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PyrotechnicCompetencyFormTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PyrotechnicCompetencyFormTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PyrotechnicCompetencyFormTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<PyrotechnicCompetencyFormTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<PyrotechnicCompetencyFormTable, String> firstNamePyro =
		createColumn(
			"firstNamePyro", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PyrotechnicCompetencyFormTable, String> surNamePyro =
		createColumn(
			"surNamePyro", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PyrotechnicCompetencyFormTable, String> middleNamePyro =
		createColumn(
			"middleNamePyro", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PyrotechnicCompetencyFormTable, String> genderPyro =
		createColumn(
			"genderPyro", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PyrotechnicCompetencyFormTable, String>
		officeNumberPyro = createColumn(
			"officeNumberPyro", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PyrotechnicCompetencyFormTable, String> cellNumPyro =
		createColumn(
			"cellNumPyro", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PyrotechnicCompetencyFormTable, String> trnNumPyro =
		createColumn(
			"trnNumPyro", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PyrotechnicCompetencyFormTable, Date> dateOfBirthPyro =
		createColumn(
			"dateOfBirthPyro", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<PyrotechnicCompetencyFormTable, String> addressPyro =
		createColumn(
			"addressPyro", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PyrotechnicCompetencyFormTable, String>
		educationalBackPyro = createColumn(
			"educationalBackPyro", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PyrotechnicCompetencyFormTable, String>
		blastingCoursePyro = createColumn(
			"blastingCoursePyro", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PyrotechnicCompetencyFormTable, String> statePyro =
		createColumn(
			"statePyro", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PyrotechnicCompetencyFormTable, String>
		nameOfCoursePyro = createColumn(
			"nameOfCoursePyro", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PyrotechnicCompetencyFormTable, String>
		courseOrganiserPyro = createColumn(
			"courseOrganiserPyro", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PyrotechnicCompetencyFormTable, String> dateAppliPyro =
		createColumn(
			"dateAppliPyro", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PyrotechnicCompetencyFormTable, Long>
		explosivesApplicationId = createColumn(
			"explosivesApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private PyrotechnicCompetencyFormTable() {
		super(
			"nbp_pyrotechnic_competency", PyrotechnicCompetencyFormTable::new);
	}

}