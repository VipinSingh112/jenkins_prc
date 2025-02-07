/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_osi_assessment_detail&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AssessmentIndividualPersonalDetails
 * @generated
 */
public class AssessmentIndividualPersonalDetailsTable
	extends BaseTable<AssessmentIndividualPersonalDetailsTable> {

	public static final AssessmentIndividualPersonalDetailsTable INSTANCE =
		new AssessmentIndividualPersonalDetailsTable();

	public final Column<AssessmentIndividualPersonalDetailsTable, Long>
		assessmentDetailsId = createColumn(
			"assessmentDetailsId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AssessmentIndividualPersonalDetailsTable, Long>
		groupId = createColumn(
			"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AssessmentIndividualPersonalDetailsTable, Date>
		initialDateContact = createColumn(
			"initialDateContact", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<AssessmentIndividualPersonalDetailsTable, String>
		personalName = createColumn(
			"personalName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AssessmentIndividualPersonalDetailsTable, String>
		personalAddress = createColumn(
			"personalAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AssessmentIndividualPersonalDetailsTable, String>
		personalEmail = createColumn(
			"personalEmail", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AssessmentIndividualPersonalDetailsTable, String>
		personalTelNum = createColumn(
			"personalTelNum", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AssessmentIndividualPersonalDetailsTable, String>
		personalTrn = createColumn(
			"personalTrn", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AssessmentIndividualPersonalDetailsTable, String>
		personalNis = createColumn(
			"personalNis", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AssessmentIndividualPersonalDetailsTable, Date>
		personalDob = createColumn(
			"personalDob", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AssessmentIndividualPersonalDetailsTable, String>
		personalAge = createColumn(
			"personalAge", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AssessmentIndividualPersonalDetailsTable, String>
		personalMaritalStatus = createColumn(
			"personalMaritalStatus", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AssessmentIndividualPersonalDetailsTable, String>
		personalDependents = createColumn(
			"personalDependents", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AssessmentIndividualPersonalDetailsTable, String>
		personalOccupation = createColumn(
			"personalOccupation", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AssessmentIndividualPersonalDetailsTable, String>
		emergencyName = createColumn(
			"emergencyName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AssessmentIndividualPersonalDetailsTable, String>
		emergencyEmail = createColumn(
			"emergencyEmail", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AssessmentIndividualPersonalDetailsTable, String>
		emergencyTelNum = createColumn(
			"emergencyTelNum", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AssessmentIndividualPersonalDetailsTable, String>
		emergencyAddress = createColumn(
			"emergencyAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AssessmentIndividualPersonalDetailsTable, String>
		emergencyEmployer = createColumn(
			"emergencyEmployer", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AssessmentIndividualPersonalDetailsTable, String>
		employerAddress = createColumn(
			"employerAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AssessmentIndividualPersonalDetailsTable, String>
		employerEmail = createColumn(
			"employerEmail", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AssessmentIndividualPersonalDetailsTable, String>
		employerTelNum = createColumn(
			"employerTelNum", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AssessmentIndividualPersonalDetailsTable, Long>
		osiInsolvencyId = createColumn(
			"osiInsolvencyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private AssessmentIndividualPersonalDetailsTable() {
		super(
			"nbp_osi_assessment_detail",
			AssessmentIndividualPersonalDetailsTable::new);
	}

}