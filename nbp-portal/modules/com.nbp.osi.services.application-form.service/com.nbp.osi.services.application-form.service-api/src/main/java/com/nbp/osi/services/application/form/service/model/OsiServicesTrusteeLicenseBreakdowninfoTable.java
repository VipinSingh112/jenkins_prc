/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_osi_services_trus_in_lic&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see OsiServicesTrusteeLicenseBreakdowninfo
 * @generated
 */
public class OsiServicesTrusteeLicenseBreakdowninfoTable
	extends BaseTable<OsiServicesTrusteeLicenseBreakdowninfoTable> {

	public static final OsiServicesTrusteeLicenseBreakdowninfoTable INSTANCE =
		new OsiServicesTrusteeLicenseBreakdowninfoTable();

	public final Column<OsiServicesTrusteeLicenseBreakdowninfoTable, String>
		uuid = createColumn(
			"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiServicesTrusteeLicenseBreakdowninfoTable, Long>
		osiLicBreakId = createColumn(
			"osiLicBreakId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<OsiServicesTrusteeLicenseBreakdowninfoTable, Long>
		groupId = createColumn(
			"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OsiServicesTrusteeLicenseBreakdowninfoTable, Long>
		companyId = createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OsiServicesTrusteeLicenseBreakdowninfoTable, Long>
		userId = createColumn(
			"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OsiServicesTrusteeLicenseBreakdowninfoTable, String>
		userName = createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiServicesTrusteeLicenseBreakdowninfoTable, Date>
		createDate = createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OsiServicesTrusteeLicenseBreakdowninfoTable, Date>
		modifiedDate = createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OsiServicesTrusteeLicenseBreakdowninfoTable, String>
		indiBreakdownApplicantName = createColumn(
			"indiBreakdownApplicantName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OsiServicesTrusteeLicenseBreakdowninfoTable, String>
		indiBreakdownFirm = createColumn(
			"indiBreakdownFirm", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OsiServicesTrusteeLicenseBreakdowninfoTable, Date>
		indiBreakdownDated = createColumn(
			"indiBreakdownDated", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<OsiServicesTrusteeLicenseBreakdowninfoTable, String>
		indiBreakdownTrusteeName = createColumn(
			"indiBreakdownTrusteeName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OsiServicesTrusteeLicenseBreakdowninfoTable, Date>
		indiBreakdownTrusteeDate = createColumn(
			"indiBreakdownTrusteeDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<OsiServicesTrusteeLicenseBreakdowninfoTable, Long>
		osiServicesApplicationId = createColumn(
			"osiServicesApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private OsiServicesTrusteeLicenseBreakdowninfoTable() {
		super(
			"nbp_osi_services_trus_in_lic",
			OsiServicesTrusteeLicenseBreakdowninfoTable::new);
	}

}