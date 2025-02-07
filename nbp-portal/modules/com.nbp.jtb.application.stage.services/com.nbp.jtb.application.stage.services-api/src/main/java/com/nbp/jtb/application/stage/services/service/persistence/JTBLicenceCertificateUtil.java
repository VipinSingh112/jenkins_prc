/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.stage.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.jtb.application.stage.services.model.JTBLicenceCertificate;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the jtb licence certificate service. This utility wraps <code>com.nbp.jtb.application.stage.services.service.persistence.impl.JTBLicenceCertificatePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JTBLicenceCertificatePersistence
 * @generated
 */
public class JTBLicenceCertificateUtil {

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
	public static void clearCache(JTBLicenceCertificate jtbLicenceCertificate) {
		getPersistence().clearCache(jtbLicenceCertificate);
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
	public static Map<Serializable, JTBLicenceCertificate> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<JTBLicenceCertificate> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<JTBLicenceCertificate> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<JTBLicenceCertificate> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<JTBLicenceCertificate> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static JTBLicenceCertificate update(
		JTBLicenceCertificate jtbLicenceCertificate) {

		return getPersistence().update(jtbLicenceCertificate);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static JTBLicenceCertificate update(
		JTBLicenceCertificate jtbLicenceCertificate,
		ServiceContext serviceContext) {

		return getPersistence().update(jtbLicenceCertificate, serviceContext);
	}

	/**
	 * Returns the jtb licence certificate where caseId = &#63; or throws a <code>NoSuchJTBLicenceCertificateException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching jtb licence certificate
	 * @throws NoSuchJTBLicenceCertificateException if a matching jtb licence certificate could not be found
	 */
	public static JTBLicenceCertificate findBygetJtbLicenceCertiBy_CI(
			String caseId)
		throws com.nbp.jtb.application.stage.services.exception.
			NoSuchJTBLicenceCertificateException {

		return getPersistence().findBygetJtbLicenceCertiBy_CI(caseId);
	}

	/**
	 * Returns the jtb licence certificate where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching jtb licence certificate, or <code>null</code> if a matching jtb licence certificate could not be found
	 */
	public static JTBLicenceCertificate fetchBygetJtbLicenceCertiBy_CI(
		String caseId) {

		return getPersistence().fetchBygetJtbLicenceCertiBy_CI(caseId);
	}

	/**
	 * Returns the jtb licence certificate where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jtb licence certificate, or <code>null</code> if a matching jtb licence certificate could not be found
	 */
	public static JTBLicenceCertificate fetchBygetJtbLicenceCertiBy_CI(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetJtbLicenceCertiBy_CI(
			caseId, useFinderCache);
	}

	/**
	 * Removes the jtb licence certificate where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the jtb licence certificate that was removed
	 */
	public static JTBLicenceCertificate removeBygetJtbLicenceCertiBy_CI(
			String caseId)
		throws com.nbp.jtb.application.stage.services.exception.
			NoSuchJTBLicenceCertificateException {

		return getPersistence().removeBygetJtbLicenceCertiBy_CI(caseId);
	}

	/**
	 * Returns the number of jtb licence certificates where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching jtb licence certificates
	 */
	public static int countBygetJtbLicenceCertiBy_CI(String caseId) {
		return getPersistence().countBygetJtbLicenceCertiBy_CI(caseId);
	}

	/**
	 * Returns all the jtb licence certificates where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching jtb licence certificates
	 */
	public static List<JTBLicenceCertificate> findBygetJtbLicCertiBy_CI(
		String caseId) {

		return getPersistence().findBygetJtbLicCertiBy_CI(caseId);
	}

	/**
	 * Returns a range of all the jtb licence certificates where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBLicenceCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of jtb licence certificates
	 * @param end the upper bound of the range of jtb licence certificates (not inclusive)
	 * @return the range of matching jtb licence certificates
	 */
	public static List<JTBLicenceCertificate> findBygetJtbLicCertiBy_CI(
		String caseId, int start, int end) {

		return getPersistence().findBygetJtbLicCertiBy_CI(caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the jtb licence certificates where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBLicenceCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of jtb licence certificates
	 * @param end the upper bound of the range of jtb licence certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jtb licence certificates
	 */
	public static List<JTBLicenceCertificate> findBygetJtbLicCertiBy_CI(
		String caseId, int start, int end,
		OrderByComparator<JTBLicenceCertificate> orderByComparator) {

		return getPersistence().findBygetJtbLicCertiBy_CI(
			caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jtb licence certificates where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBLicenceCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of jtb licence certificates
	 * @param end the upper bound of the range of jtb licence certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jtb licence certificates
	 */
	public static List<JTBLicenceCertificate> findBygetJtbLicCertiBy_CI(
		String caseId, int start, int end,
		OrderByComparator<JTBLicenceCertificate> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetJtbLicCertiBy_CI(
			caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first jtb licence certificate in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb licence certificate
	 * @throws NoSuchJTBLicenceCertificateException if a matching jtb licence certificate could not be found
	 */
	public static JTBLicenceCertificate findBygetJtbLicCertiBy_CI_First(
			String caseId,
			OrderByComparator<JTBLicenceCertificate> orderByComparator)
		throws com.nbp.jtb.application.stage.services.exception.
			NoSuchJTBLicenceCertificateException {

		return getPersistence().findBygetJtbLicCertiBy_CI_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the first jtb licence certificate in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb licence certificate, or <code>null</code> if a matching jtb licence certificate could not be found
	 */
	public static JTBLicenceCertificate fetchBygetJtbLicCertiBy_CI_First(
		String caseId,
		OrderByComparator<JTBLicenceCertificate> orderByComparator) {

		return getPersistence().fetchBygetJtbLicCertiBy_CI_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last jtb licence certificate in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb licence certificate
	 * @throws NoSuchJTBLicenceCertificateException if a matching jtb licence certificate could not be found
	 */
	public static JTBLicenceCertificate findBygetJtbLicCertiBy_CI_Last(
			String caseId,
			OrderByComparator<JTBLicenceCertificate> orderByComparator)
		throws com.nbp.jtb.application.stage.services.exception.
			NoSuchJTBLicenceCertificateException {

		return getPersistence().findBygetJtbLicCertiBy_CI_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last jtb licence certificate in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb licence certificate, or <code>null</code> if a matching jtb licence certificate could not be found
	 */
	public static JTBLicenceCertificate fetchBygetJtbLicCertiBy_CI_Last(
		String caseId,
		OrderByComparator<JTBLicenceCertificate> orderByComparator) {

		return getPersistence().fetchBygetJtbLicCertiBy_CI_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the jtb licence certificates before and after the current jtb licence certificate in the ordered set where caseId = &#63;.
	 *
	 * @param jTBLicenceCertificateId the primary key of the current jtb licence certificate
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jtb licence certificate
	 * @throws NoSuchJTBLicenceCertificateException if a jtb licence certificate with the primary key could not be found
	 */
	public static JTBLicenceCertificate[] findBygetJtbLicCertiBy_CI_PrevAndNext(
			long jTBLicenceCertificateId, String caseId,
			OrderByComparator<JTBLicenceCertificate> orderByComparator)
		throws com.nbp.jtb.application.stage.services.exception.
			NoSuchJTBLicenceCertificateException {

		return getPersistence().findBygetJtbLicCertiBy_CI_PrevAndNext(
			jTBLicenceCertificateId, caseId, orderByComparator);
	}

	/**
	 * Removes all the jtb licence certificates where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public static void removeBygetJtbLicCertiBy_CI(String caseId) {
		getPersistence().removeBygetJtbLicCertiBy_CI(caseId);
	}

	/**
	 * Returns the number of jtb licence certificates where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching jtb licence certificates
	 */
	public static int countBygetJtbLicCertiBy_CI(String caseId) {
		return getPersistence().countBygetJtbLicCertiBy_CI(caseId);
	}

	/**
	 * Caches the jtb licence certificate in the entity cache if it is enabled.
	 *
	 * @param jtbLicenceCertificate the jtb licence certificate
	 */
	public static void cacheResult(
		JTBLicenceCertificate jtbLicenceCertificate) {

		getPersistence().cacheResult(jtbLicenceCertificate);
	}

	/**
	 * Caches the jtb licence certificates in the entity cache if it is enabled.
	 *
	 * @param jtbLicenceCertificates the jtb licence certificates
	 */
	public static void cacheResult(
		List<JTBLicenceCertificate> jtbLicenceCertificates) {

		getPersistence().cacheResult(jtbLicenceCertificates);
	}

	/**
	 * Creates a new jtb licence certificate with the primary key. Does not add the jtb licence certificate to the database.
	 *
	 * @param jTBLicenceCertificateId the primary key for the new jtb licence certificate
	 * @return the new jtb licence certificate
	 */
	public static JTBLicenceCertificate create(long jTBLicenceCertificateId) {
		return getPersistence().create(jTBLicenceCertificateId);
	}

	/**
	 * Removes the jtb licence certificate with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jTBLicenceCertificateId the primary key of the jtb licence certificate
	 * @return the jtb licence certificate that was removed
	 * @throws NoSuchJTBLicenceCertificateException if a jtb licence certificate with the primary key could not be found
	 */
	public static JTBLicenceCertificate remove(long jTBLicenceCertificateId)
		throws com.nbp.jtb.application.stage.services.exception.
			NoSuchJTBLicenceCertificateException {

		return getPersistence().remove(jTBLicenceCertificateId);
	}

	public static JTBLicenceCertificate updateImpl(
		JTBLicenceCertificate jtbLicenceCertificate) {

		return getPersistence().updateImpl(jtbLicenceCertificate);
	}

	/**
	 * Returns the jtb licence certificate with the primary key or throws a <code>NoSuchJTBLicenceCertificateException</code> if it could not be found.
	 *
	 * @param jTBLicenceCertificateId the primary key of the jtb licence certificate
	 * @return the jtb licence certificate
	 * @throws NoSuchJTBLicenceCertificateException if a jtb licence certificate with the primary key could not be found
	 */
	public static JTBLicenceCertificate findByPrimaryKey(
			long jTBLicenceCertificateId)
		throws com.nbp.jtb.application.stage.services.exception.
			NoSuchJTBLicenceCertificateException {

		return getPersistence().findByPrimaryKey(jTBLicenceCertificateId);
	}

	/**
	 * Returns the jtb licence certificate with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jTBLicenceCertificateId the primary key of the jtb licence certificate
	 * @return the jtb licence certificate, or <code>null</code> if a jtb licence certificate with the primary key could not be found
	 */
	public static JTBLicenceCertificate fetchByPrimaryKey(
		long jTBLicenceCertificateId) {

		return getPersistence().fetchByPrimaryKey(jTBLicenceCertificateId);
	}

	/**
	 * Returns all the jtb licence certificates.
	 *
	 * @return the jtb licence certificates
	 */
	public static List<JTBLicenceCertificate> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the jtb licence certificates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBLicenceCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb licence certificates
	 * @param end the upper bound of the range of jtb licence certificates (not inclusive)
	 * @return the range of jtb licence certificates
	 */
	public static List<JTBLicenceCertificate> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the jtb licence certificates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBLicenceCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb licence certificates
	 * @param end the upper bound of the range of jtb licence certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jtb licence certificates
	 */
	public static List<JTBLicenceCertificate> findAll(
		int start, int end,
		OrderByComparator<JTBLicenceCertificate> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jtb licence certificates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBLicenceCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb licence certificates
	 * @param end the upper bound of the range of jtb licence certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jtb licence certificates
	 */
	public static List<JTBLicenceCertificate> findAll(
		int start, int end,
		OrderByComparator<JTBLicenceCertificate> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the jtb licence certificates from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of jtb licence certificates.
	 *
	 * @return the number of jtb licence certificates
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static JTBLicenceCertificatePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		JTBLicenceCertificatePersistence persistence) {

		_persistence = persistence;
	}

	private static volatile JTBLicenceCertificatePersistence _persistence;

}