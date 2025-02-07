/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.application.form.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_osi_affiliation&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see ProfessionalAffiliation
 * @generated
 */
public class ProfessionalAffiliationTable
	extends BaseTable<ProfessionalAffiliationTable> {

	public static final ProfessionalAffiliationTable INSTANCE =
		new ProfessionalAffiliationTable();

	public final Column<ProfessionalAffiliationTable, Long>
		professionalAffiliationId = createColumn(
			"professionalAffiliationId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<ProfessionalAffiliationTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ProfessionalAffiliationTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ProfessionalAffiliationTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ProfessionalAffiliationTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ProfessionalAffiliationTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<ProfessionalAffiliationTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<ProfessionalAffiliationTable, Date>
		professionalAffiliationsDate = createColumn(
			"professionalAffiliationsDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<ProfessionalAffiliationTable, String>
		affiliationMultivalue = createColumn(
			"affiliationMultivalue", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<ProfessionalAffiliationTable, Long> osiApplicationId =
		createColumn(
			"osiApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private ProfessionalAffiliationTable() {
		super("nbp_osi_affiliation", ProfessionalAffiliationTable::new);
	}

}