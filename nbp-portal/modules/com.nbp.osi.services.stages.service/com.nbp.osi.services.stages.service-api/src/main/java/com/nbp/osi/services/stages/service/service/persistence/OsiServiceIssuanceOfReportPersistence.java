/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.stages.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.osi.services.stages.service.exception.NoSuchOsiServiceIssuanceOfReportException;
import com.nbp.osi.services.stages.service.model.OsiServiceIssuanceOfReport;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the osi service issuance of report service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiServiceIssuanceOfReportUtil
 * @generated
 */
@ProviderType
public interface OsiServiceIssuanceOfReportPersistence
	extends BasePersistence<OsiServiceIssuanceOfReport> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link OsiServiceIssuanceOfReportUtil} to access the osi service issuance of report persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the osi service issuance of report where caseId = &#63; or throws a <code>NoSuchOsiServiceIssuanceOfReportException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching osi service issuance of report
	 * @throws NoSuchOsiServiceIssuanceOfReportException if a matching osi service issuance of report could not be found
	 */
	public OsiServiceIssuanceOfReport findBygetOSIIssuanceOfReportBy_CI(
			String caseId)
		throws NoSuchOsiServiceIssuanceOfReportException;

	/**
	 * Returns the osi service issuance of report where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching osi service issuance of report, or <code>null</code> if a matching osi service issuance of report could not be found
	 */
	public OsiServiceIssuanceOfReport fetchBygetOSIIssuanceOfReportBy_CI(
		String caseId);

	/**
	 * Returns the osi service issuance of report where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi service issuance of report, or <code>null</code> if a matching osi service issuance of report could not be found
	 */
	public OsiServiceIssuanceOfReport fetchBygetOSIIssuanceOfReportBy_CI(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the osi service issuance of report where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the osi service issuance of report that was removed
	 */
	public OsiServiceIssuanceOfReport removeBygetOSIIssuanceOfReportBy_CI(
			String caseId)
		throws NoSuchOsiServiceIssuanceOfReportException;

	/**
	 * Returns the number of osi service issuance of reports where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching osi service issuance of reports
	 */
	public int countBygetOSIIssuanceOfReportBy_CI(String caseId);

	/**
	 * Caches the osi service issuance of report in the entity cache if it is enabled.
	 *
	 * @param osiServiceIssuanceOfReport the osi service issuance of report
	 */
	public void cacheResult(
		OsiServiceIssuanceOfReport osiServiceIssuanceOfReport);

	/**
	 * Caches the osi service issuance of reports in the entity cache if it is enabled.
	 *
	 * @param osiServiceIssuanceOfReports the osi service issuance of reports
	 */
	public void cacheResult(
		java.util.List<OsiServiceIssuanceOfReport> osiServiceIssuanceOfReports);

	/**
	 * Creates a new osi service issuance of report with the primary key. Does not add the osi service issuance of report to the database.
	 *
	 * @param osiServiceIssuanceOfReportId the primary key for the new osi service issuance of report
	 * @return the new osi service issuance of report
	 */
	public OsiServiceIssuanceOfReport create(long osiServiceIssuanceOfReportId);

	/**
	 * Removes the osi service issuance of report with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osiServiceIssuanceOfReportId the primary key of the osi service issuance of report
	 * @return the osi service issuance of report that was removed
	 * @throws NoSuchOsiServiceIssuanceOfReportException if a osi service issuance of report with the primary key could not be found
	 */
	public OsiServiceIssuanceOfReport remove(long osiServiceIssuanceOfReportId)
		throws NoSuchOsiServiceIssuanceOfReportException;

	public OsiServiceIssuanceOfReport updateImpl(
		OsiServiceIssuanceOfReport osiServiceIssuanceOfReport);

	/**
	 * Returns the osi service issuance of report with the primary key or throws a <code>NoSuchOsiServiceIssuanceOfReportException</code> if it could not be found.
	 *
	 * @param osiServiceIssuanceOfReportId the primary key of the osi service issuance of report
	 * @return the osi service issuance of report
	 * @throws NoSuchOsiServiceIssuanceOfReportException if a osi service issuance of report with the primary key could not be found
	 */
	public OsiServiceIssuanceOfReport findByPrimaryKey(
			long osiServiceIssuanceOfReportId)
		throws NoSuchOsiServiceIssuanceOfReportException;

	/**
	 * Returns the osi service issuance of report with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osiServiceIssuanceOfReportId the primary key of the osi service issuance of report
	 * @return the osi service issuance of report, or <code>null</code> if a osi service issuance of report with the primary key could not be found
	 */
	public OsiServiceIssuanceOfReport fetchByPrimaryKey(
		long osiServiceIssuanceOfReportId);

	/**
	 * Returns all the osi service issuance of reports.
	 *
	 * @return the osi service issuance of reports
	 */
	public java.util.List<OsiServiceIssuanceOfReport> findAll();

	/**
	 * Returns a range of all the osi service issuance of reports.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServiceIssuanceOfReportModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi service issuance of reports
	 * @param end the upper bound of the range of osi service issuance of reports (not inclusive)
	 * @return the range of osi service issuance of reports
	 */
	public java.util.List<OsiServiceIssuanceOfReport> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the osi service issuance of reports.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServiceIssuanceOfReportModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi service issuance of reports
	 * @param end the upper bound of the range of osi service issuance of reports (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi service issuance of reports
	 */
	public java.util.List<OsiServiceIssuanceOfReport> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiServiceIssuanceOfReport> orderByComparator);

	/**
	 * Returns an ordered range of all the osi service issuance of reports.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServiceIssuanceOfReportModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi service issuance of reports
	 * @param end the upper bound of the range of osi service issuance of reports (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi service issuance of reports
	 */
	public java.util.List<OsiServiceIssuanceOfReport> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiServiceIssuanceOfReport> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the osi service issuance of reports from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of osi service issuance of reports.
	 *
	 * @return the number of osi service issuance of reports
	 */
	public int countAll();

}