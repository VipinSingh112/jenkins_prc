/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.explosives.competency.stages.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_explosive_issu_lic&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see ExplosiveIssuanceOfLicence
 * @generated
 */
public class ExplosiveIssuanceOfLicenceTable
	extends BaseTable<ExplosiveIssuanceOfLicenceTable> {

	public static final ExplosiveIssuanceOfLicenceTable INSTANCE =
		new ExplosiveIssuanceOfLicenceTable();

	public final Column<ExplosiveIssuanceOfLicenceTable, String> uuid =
		createColumn("uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ExplosiveIssuanceOfLicenceTable, Long> issuanceId =
		createColumn(
			"issuanceId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<ExplosiveIssuanceOfLicenceTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ExplosiveIssuanceOfLicenceTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ExplosiveIssuanceOfLicenceTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ExplosiveIssuanceOfLicenceTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ExplosiveIssuanceOfLicenceTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<ExplosiveIssuanceOfLicenceTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<ExplosiveIssuanceOfLicenceTable, Date> dateOfIssuance =
		createColumn(
			"dateOfIssuance", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<ExplosiveIssuanceOfLicenceTable, Date>
		dateOfExpiration = createColumn(
			"dateOfExpiration", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<ExplosiveIssuanceOfLicenceTable, String>
		certificateNumber = createColumn(
			"certificateNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<ExplosiveIssuanceOfLicenceTable, Long>
		certificateNumberId = createColumn(
			"certificateNumberId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<ExplosiveIssuanceOfLicenceTable, String> caseId =
		createColumn(
			"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private ExplosiveIssuanceOfLicenceTable() {
		super("nbp_explosive_issu_lic", ExplosiveIssuanceOfLicenceTable::new);
	}

}