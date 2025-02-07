/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.application.form.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.wra.application.form.service.model.LicenceToAbstractInfo;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for LicenceToAbstractInfo. This utility wraps
 * <code>com.nbp.wra.application.form.service.service.impl.LicenceToAbstractInfoLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see LicenceToAbstractInfoLocalService
 * @generated
 */
public class LicenceToAbstractInfoLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.wra.application.form.service.service.impl.LicenceToAbstractInfoLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the licence to abstract info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect LicenceToAbstractInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param licenceToAbstractInfo the licence to abstract info
	 * @return the licence to abstract info that was added
	 */
	public static LicenceToAbstractInfo addLicenceToAbstractInfo(
		LicenceToAbstractInfo licenceToAbstractInfo) {

		return getService().addLicenceToAbstractInfo(licenceToAbstractInfo);
	}

	/**
	 * Creates a new licence to abstract info with the primary key. Does not add the licence to abstract info to the database.
	 *
	 * @param abstractLicenceId the primary key for the new licence to abstract info
	 * @return the new licence to abstract info
	 */
	public static LicenceToAbstractInfo createLicenceToAbstractInfo(
		long abstractLicenceId) {

		return getService().createLicenceToAbstractInfo(abstractLicenceId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the licence to abstract info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect LicenceToAbstractInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param licenceToAbstractInfo the licence to abstract info
	 * @return the licence to abstract info that was removed
	 */
	public static LicenceToAbstractInfo deleteLicenceToAbstractInfo(
		LicenceToAbstractInfo licenceToAbstractInfo) {

		return getService().deleteLicenceToAbstractInfo(licenceToAbstractInfo);
	}

	/**
	 * Deletes the licence to abstract info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect LicenceToAbstractInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param abstractLicenceId the primary key of the licence to abstract info
	 * @return the licence to abstract info that was removed
	 * @throws PortalException if a licence to abstract info with the primary key could not be found
	 */
	public static LicenceToAbstractInfo deleteLicenceToAbstractInfo(
			long abstractLicenceId)
		throws PortalException {

		return getService().deleteLicenceToAbstractInfo(abstractLicenceId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static <T> T dslQuery(DSLQuery dslQuery) {
		return getService().dslQuery(dslQuery);
	}

	public static int dslQueryCount(DSLQuery dslQuery) {
		return getService().dslQueryCount(dslQuery);
	}

	public static DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.wra.application.form.service.model.impl.LicenceToAbstractInfoModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.wra.application.form.service.model.impl.LicenceToAbstractInfoModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static LicenceToAbstractInfo fetchLicenceToAbstractInfo(
		long abstractLicenceId) {

		return getService().fetchLicenceToAbstractInfo(abstractLicenceId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	public static LicenceToAbstractInfo getLicenceToAbstract_By_Id(
			long wraApplicationId)
		throws com.nbp.wra.application.form.service.exception.
			NoSuchLicenceToAbstractInfoException {

		return getService().getLicenceToAbstract_By_Id(wraApplicationId);
	}

	/**
	 * Returns the licence to abstract info with the primary key.
	 *
	 * @param abstractLicenceId the primary key of the licence to abstract info
	 * @return the licence to abstract info
	 * @throws PortalException if a licence to abstract info with the primary key could not be found
	 */
	public static LicenceToAbstractInfo getLicenceToAbstractInfo(
			long abstractLicenceId)
		throws PortalException {

		return getService().getLicenceToAbstractInfo(abstractLicenceId);
	}

	/**
	 * Returns a range of all the licence to abstract infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.wra.application.form.service.model.impl.LicenceToAbstractInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of licence to abstract infos
	 * @param end the upper bound of the range of licence to abstract infos (not inclusive)
	 * @return the range of licence to abstract infos
	 */
	public static List<LicenceToAbstractInfo> getLicenceToAbstractInfos(
		int start, int end) {

		return getService().getLicenceToAbstractInfos(start, end);
	}

	/**
	 * Returns the number of licence to abstract infos.
	 *
	 * @return the number of licence to abstract infos
	 */
	public static int getLicenceToAbstractInfosCount() {
		return getService().getLicenceToAbstractInfosCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the licence to abstract info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect LicenceToAbstractInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param licenceToAbstractInfo the licence to abstract info
	 * @return the licence to abstract info that was updated
	 */
	public static LicenceToAbstractInfo updateLicenceToAbstractInfo(
		LicenceToAbstractInfo licenceToAbstractInfo) {

		return getService().updateLicenceToAbstractInfo(licenceToAbstractInfo);
	}

	public static LicenceToAbstractInfoLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<LicenceToAbstractInfoLocalService>
		_serviceSnapshot = new Snapshot<>(
			LicenceToAbstractInfoLocalServiceUtil.class,
			LicenceToAbstractInfoLocalService.class);

}