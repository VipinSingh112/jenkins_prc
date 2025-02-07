/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_hsra_applicant&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AddApplicantPractitioner
 * @generated
 */
public class AddApplicantPractitionerTable
	extends BaseTable<AddApplicantPractitionerTable> {

	public static final AddApplicantPractitionerTable INSTANCE =
		new AddApplicantPractitionerTable();

	public final Column<AddApplicantPractitionerTable, String> uuid =
		createColumn("uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddApplicantPractitionerTable, Long>
		addApplicantPractitionerId = createColumn(
			"addApplicantPractitionerId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AddApplicantPractitionerTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddApplicantPractitionerTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddApplicantPractitionerTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddApplicantPractitionerTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddApplicantPractitionerTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AddApplicantPractitionerTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AddApplicantPractitionerTable, Date> applicantDate =
		createColumn(
			"applicantDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AddApplicantPractitionerTable, String> counter =
		createColumn(
			"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddApplicantPractitionerTable, Long> hsraApplicationId =
		createColumn(
			"hsraApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private AddApplicantPractitionerTable() {
		super("nbp_hsra_applicant", AddApplicantPractitionerTable::new);
	}

}