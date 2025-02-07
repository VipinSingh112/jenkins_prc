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
 * The table class for the &quot;nbp_osi_services_trus_co_info&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see OsiServicesTrusteeCompanyinfo
 * @generated
 */
public class OsiServicesTrusteeCompanyinfoTable
	extends BaseTable<OsiServicesTrusteeCompanyinfoTable> {

	public static final OsiServicesTrusteeCompanyinfoTable INSTANCE =
		new OsiServicesTrusteeCompanyinfoTable();

	public final Column<OsiServicesTrusteeCompanyinfoTable, String> uuid =
		createColumn("uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiServicesTrusteeCompanyinfoTable, Long> osiTrusId =
		createColumn(
			"osiTrusId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<OsiServicesTrusteeCompanyinfoTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OsiServicesTrusteeCompanyinfoTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OsiServicesTrusteeCompanyinfoTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OsiServicesTrusteeCompanyinfoTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiServicesTrusteeCompanyinfoTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OsiServicesTrusteeCompanyinfoTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OsiServicesTrusteeCompanyinfoTable, String>
		comCorporationName = createColumn(
			"comCorporationName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OsiServicesTrusteeCompanyinfoTable, String>
		comHeadOfficeAddress = createColumn(
			"comHeadOfficeAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OsiServicesTrusteeCompanyinfoTable, String> comTeleNo =
		createColumn(
			"comTeleNo", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiServicesTrusteeCompanyinfoTable, String> comFaxNo =
		createColumn(
			"comFaxNo", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiServicesTrusteeCompanyinfoTable, String> comEmail =
		createColumn(
			"comEmail", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiServicesTrusteeCompanyinfoTable, String>
		otherCountry = createColumn(
			"otherCountry", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiServicesTrusteeCompanyinfoTable, Date>
		comIncorporationDate = createColumn(
			"comIncorporationDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<OsiServicesTrusteeCompanyinfoTable, String>
		comLicenceRequest = createColumn(
			"comLicenceRequest", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OsiServicesTrusteeCompanyinfoTable, Long>
		osiServicesApplicationId = createColumn(
			"osiServicesApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private OsiServicesTrusteeCompanyinfoTable() {
		super(
			"nbp_osi_services_trus_co_info",
			OsiServicesTrusteeCompanyinfoTable::new);
	}

}