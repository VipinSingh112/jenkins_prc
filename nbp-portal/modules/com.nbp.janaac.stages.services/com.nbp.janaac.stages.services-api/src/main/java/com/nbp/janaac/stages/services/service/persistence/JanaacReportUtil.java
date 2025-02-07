/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.stages.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.janaac.stages.services.model.JanaacReport;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the janaac report service. This utility wraps <code>com.nbp.janaac.stages.services.service.persistence.impl.JanaacReportPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JanaacReportPersistence
 * @generated
 */
public class JanaacReportUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(JanaacReport janaacReport) {
		getPersistence().clearCache(janaacReport);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, JanaacReport> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<JanaacReport> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<JanaacReport> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<JanaacReport> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<JanaacReport> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static JanaacReport update(JanaacReport janaacReport) {
		return getPersistence().update(janaacReport);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static JanaacReport update(
		JanaacReport janaacReport, ServiceContext serviceContext) {

		return getPersistence().update(janaacReport, serviceContext);
	}

	/**
	 * Returns the janaac report where caseId = &#63; or throws a <code>NoSuchJanaacReportException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching janaac report
	 * @throws NoSuchJanaacReportException if a matching janaac report could not be found
	 */
	public static JanaacReport findBygetJanaac_by_caseId(String caseId)
		throws com.nbp.janaac.stages.services.exception.
			NoSuchJanaacReportException {

		return getPersistence().findBygetJanaac_by_caseId(caseId);
	}

	/**
	 * Returns the janaac report where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching janaac report, or <code>null</code> if a matching janaac report could not be found
	 */
	public static JanaacReport fetchBygetJanaac_by_caseId(String caseId) {
		return getPersistence().fetchBygetJanaac_by_caseId(caseId);
	}

	/**
	 * Returns the janaac report where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching janaac report, or <code>null</code> if a matching janaac report could not be found
	 */
	public static JanaacReport fetchBygetJanaac_by_caseId(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetJanaac_by_caseId(
			caseId, useFinderCache);
	}

	/**
	 * Removes the janaac report where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the janaac report that was removed
	 */
	public static JanaacReport removeBygetJanaac_by_caseId(String caseId)
		throws com.nbp.janaac.stages.services.exception.
			NoSuchJanaacReportException {

		return getPersistence().removeBygetJanaac_by_caseId(caseId);
	}

	/**
	 * Returns the number of janaac reports where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching janaac reports
	 */
	public static int countBygetJanaac_by_caseId(String caseId) {
		return getPersistence().countBygetJanaac_by_caseId(caseId);
	}

	/**
	 * Caches the janaac report in the entity cache if it is enabled.
	 *
	 * @param janaacReport the janaac report
	 */
	public static void cacheResult(JanaacReport janaacReport) {
		getPersistence().cacheResult(janaacReport);
	}

	/**
	 * Caches the janaac reports in the entity cache if it is enabled.
	 *
	 * @param janaacReports the janaac reports
	 */
	public static void cacheResult(List<JanaacReport> janaacReports) {
		getPersistence().cacheResult(janaacReports);
	}

	/**
	 * Creates a new janaac report with the primary key. Does not add the janaac report to the database.
	 *
	 * @param janaacReportId the primary key for the new janaac report
	 * @return the new janaac report
	 */
	public static JanaacReport create(long janaacReportId) {
		return getPersistence().create(janaacReportId);
	}

	/**
	 * Removes the janaac report with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param janaacReportId the primary key of the janaac report
	 * @return the janaac report that was removed
	 * @throws NoSuchJanaacReportException if a janaac report with the primary key could not be found
	 */
	public static JanaacReport remove(long janaacReportId)
		throws com.nbp.janaac.stages.services.exception.
			NoSuchJanaacReportException {

		return getPersistence().remove(janaacReportId);
	}

	public static JanaacReport updateImpl(JanaacReport janaacReport) {
		return getPersistence().updateImpl(janaacReport);
	}

	/**
	 * Returns the janaac report with the primary key or throws a <code>NoSuchJanaacReportException</code> if it could not be found.
	 *
	 * @param janaacReportId the primary key of the janaac report
	 * @return the janaac report
	 * @throws NoSuchJanaacReportException if a janaac report with the primary key could not be found
	 */
	public static JanaacReport findByPrimaryKey(long janaacReportId)
		throws com.nbp.janaac.stages.services.exception.
			NoSuchJanaacReportException {

		return getPersistence().findByPrimaryKey(janaacReportId);
	}

	/**
	 * Returns the janaac report with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param janaacReportId the primary key of the janaac report
	 * @return the janaac report, or <code>null</code> if a janaac report with the primary key could not be found
	 */
	public static JanaacReport fetchByPrimaryKey(long janaacReportId) {
		return getPersistence().fetchByPrimaryKey(janaacReportId);
	}

	/**
	 * Returns all the janaac reports.
	 *
	 * @return the janaac reports
	 */
	public static List<JanaacReport> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the janaac reports.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacReportModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of janaac reports
	 * @param end the upper bound of the range of janaac reports (not inclusive)
	 * @return the range of janaac reports
	 */
	public static List<JanaacReport> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the janaac reports.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacReportModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of janaac reports
	 * @param end the upper bound of the range of janaac reports (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of janaac reports
	 */
	public static List<JanaacReport> findAll(
		int start, int end, OrderByComparator<JanaacReport> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the janaac reports.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacReportModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of janaac reports
	 * @param end the upper bound of the range of janaac reports (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of janaac reports
	 */
	public static List<JanaacReport> findAll(
		int start, int end, OrderByComparator<JanaacReport> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the janaac reports from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of janaac reports.
	 *
	 * @return the number of janaac reports
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static JanaacReportPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(JanaacReportPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile JanaacReportPersistence _persistence;

}