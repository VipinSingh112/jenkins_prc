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

import com.nbp.wra.application.form.service.model.LicenceToWellDriller;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for LicenceToWellDriller. This utility wraps
 * <code>com.nbp.wra.application.form.service.service.impl.LicenceToWellDrillerLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see LicenceToWellDrillerLocalService
 * @generated
 */
public class LicenceToWellDrillerLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.wra.application.form.service.service.impl.LicenceToWellDrillerLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the licence to well driller to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect LicenceToWellDrillerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param licenceToWellDriller the licence to well driller
	 * @return the licence to well driller that was added
	 */
	public static LicenceToWellDriller addLicenceToWellDriller(
		LicenceToWellDriller licenceToWellDriller) {

		return getService().addLicenceToWellDriller(licenceToWellDriller);
	}

	/**
	 * Creates a new licence to well driller with the primary key. Does not add the licence to well driller to the database.
	 *
	 * @param licenceToWellDrillerId the primary key for the new licence to well driller
	 * @return the new licence to well driller
	 */
	public static LicenceToWellDriller createLicenceToWellDriller(
		long licenceToWellDrillerId) {

		return getService().createLicenceToWellDriller(licenceToWellDrillerId);
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
	 * Deletes the licence to well driller from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect LicenceToWellDrillerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param licenceToWellDriller the licence to well driller
	 * @return the licence to well driller that was removed
	 */
	public static LicenceToWellDriller deleteLicenceToWellDriller(
		LicenceToWellDriller licenceToWellDriller) {

		return getService().deleteLicenceToWellDriller(licenceToWellDriller);
	}

	/**
	 * Deletes the licence to well driller with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect LicenceToWellDrillerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param licenceToWellDrillerId the primary key of the licence to well driller
	 * @return the licence to well driller that was removed
	 * @throws PortalException if a licence to well driller with the primary key could not be found
	 */
	public static LicenceToWellDriller deleteLicenceToWellDriller(
			long licenceToWellDrillerId)
		throws PortalException {

		return getService().deleteLicenceToWellDriller(licenceToWellDrillerId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.wra.application.form.service.model.impl.LicenceToWellDrillerModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.wra.application.form.service.model.impl.LicenceToWellDrillerModelImpl</code>.
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

	public static LicenceToWellDriller fetchLicenceToWellDriller(
		long licenceToWellDrillerId) {

		return getService().fetchLicenceToWellDriller(licenceToWellDrillerId);
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

	/**
	 * Returns the licence to well driller with the primary key.
	 *
	 * @param licenceToWellDrillerId the primary key of the licence to well driller
	 * @return the licence to well driller
	 * @throws PortalException if a licence to well driller with the primary key could not be found
	 */
	public static LicenceToWellDriller getLicenceToWellDriller(
			long licenceToWellDrillerId)
		throws PortalException {

		return getService().getLicenceToWellDriller(licenceToWellDrillerId);
	}

	public static LicenceToWellDriller getLicenceToWellDriller_By_Id(
			long wraApplicationId)
		throws com.nbp.wra.application.form.service.exception.
			NoSuchLicenceToWellDrillerException {

		return getService().getLicenceToWellDriller_By_Id(wraApplicationId);
	}

	/**
	 * Returns a range of all the licence to well drillers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.wra.application.form.service.model.impl.LicenceToWellDrillerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of licence to well drillers
	 * @param end the upper bound of the range of licence to well drillers (not inclusive)
	 * @return the range of licence to well drillers
	 */
	public static List<LicenceToWellDriller> getLicenceToWellDrillers(
		int start, int end) {

		return getService().getLicenceToWellDrillers(start, end);
	}

	/**
	 * Returns the number of licence to well drillers.
	 *
	 * @return the number of licence to well drillers
	 */
	public static int getLicenceToWellDrillersCount() {
		return getService().getLicenceToWellDrillersCount();
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
	 * Updates the licence to well driller in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect LicenceToWellDrillerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param licenceToWellDriller the licence to well driller
	 * @return the licence to well driller that was updated
	 */
	public static LicenceToWellDriller updateLicenceToWellDriller(
		LicenceToWellDriller licenceToWellDriller) {

		return getService().updateLicenceToWellDriller(licenceToWellDriller);
	}

	public static LicenceToWellDrillerLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<LicenceToWellDrillerLocalService>
		_serviceSnapshot = new Snapshot<>(
			LicenceToWellDrillerLocalServiceUtil.class,
			LicenceToWellDrillerLocalService.class);

}