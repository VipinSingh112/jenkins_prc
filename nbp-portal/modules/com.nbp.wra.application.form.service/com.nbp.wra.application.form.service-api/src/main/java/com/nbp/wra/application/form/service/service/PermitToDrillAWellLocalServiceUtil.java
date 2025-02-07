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

import com.nbp.wra.application.form.service.model.PermitToDrillAWell;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for PermitToDrillAWell. This utility wraps
 * <code>com.nbp.wra.application.form.service.service.impl.PermitToDrillAWellLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see PermitToDrillAWellLocalService
 * @generated
 */
public class PermitToDrillAWellLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.wra.application.form.service.service.impl.PermitToDrillAWellLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the permit to drill a well to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PermitToDrillAWellLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param permitToDrillAWell the permit to drill a well
	 * @return the permit to drill a well that was added
	 */
	public static PermitToDrillAWell addPermitToDrillAWell(
		PermitToDrillAWell permitToDrillAWell) {

		return getService().addPermitToDrillAWell(permitToDrillAWell);
	}

	/**
	 * Creates a new permit to drill a well with the primary key. Does not add the permit to drill a well to the database.
	 *
	 * @param drillAWellApplicationId the primary key for the new permit to drill a well
	 * @return the new permit to drill a well
	 */
	public static PermitToDrillAWell createPermitToDrillAWell(
		long drillAWellApplicationId) {

		return getService().createPermitToDrillAWell(drillAWellApplicationId);
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
	 * Deletes the permit to drill a well with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PermitToDrillAWellLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param drillAWellApplicationId the primary key of the permit to drill a well
	 * @return the permit to drill a well that was removed
	 * @throws PortalException if a permit to drill a well with the primary key could not be found
	 */
	public static PermitToDrillAWell deletePermitToDrillAWell(
			long drillAWellApplicationId)
		throws PortalException {

		return getService().deletePermitToDrillAWell(drillAWellApplicationId);
	}

	/**
	 * Deletes the permit to drill a well from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PermitToDrillAWellLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param permitToDrillAWell the permit to drill a well
	 * @return the permit to drill a well that was removed
	 */
	public static PermitToDrillAWell deletePermitToDrillAWell(
		PermitToDrillAWell permitToDrillAWell) {

		return getService().deletePermitToDrillAWell(permitToDrillAWell);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.wra.application.form.service.model.impl.PermitToDrillAWellModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.wra.application.form.service.model.impl.PermitToDrillAWellModelImpl</code>.
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

	public static PermitToDrillAWell fetchPermitToDrillAWell(
		long drillAWellApplicationId) {

		return getService().fetchPermitToDrillAWell(drillAWellApplicationId);
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
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * Returns the permit to drill a well with the primary key.
	 *
	 * @param drillAWellApplicationId the primary key of the permit to drill a well
	 * @return the permit to drill a well
	 * @throws PortalException if a permit to drill a well with the primary key could not be found
	 */
	public static PermitToDrillAWell getPermitToDrillAWell(
			long drillAWellApplicationId)
		throws PortalException {

		return getService().getPermitToDrillAWell(drillAWellApplicationId);
	}

	public static PermitToDrillAWell getPermitToDrillAWell_By_Id() {
		return getService().getPermitToDrillAWell_By_Id();
	}

	public static PermitToDrillAWell getPermitToDrillAWell_By_WRAAppId(
			long wraApplicationId)
		throws com.nbp.wra.application.form.service.exception.
			NoSuchPermitToDrillAWellException {

		return getService().getPermitToDrillAWell_By_WRAAppId(wraApplicationId);
	}

	/**
	 * Returns a range of all the permit to drill a wells.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.wra.application.form.service.model.impl.PermitToDrillAWellModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of permit to drill a wells
	 * @param end the upper bound of the range of permit to drill a wells (not inclusive)
	 * @return the range of permit to drill a wells
	 */
	public static List<PermitToDrillAWell> getPermitToDrillAWells(
		int start, int end) {

		return getService().getPermitToDrillAWells(start, end);
	}

	/**
	 * Returns the number of permit to drill a wells.
	 *
	 * @return the number of permit to drill a wells
	 */
	public static int getPermitToDrillAWellsCount() {
		return getService().getPermitToDrillAWellsCount();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the permit to drill a well in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PermitToDrillAWellLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param permitToDrillAWell the permit to drill a well
	 * @return the permit to drill a well that was updated
	 */
	public static PermitToDrillAWell updatePermitToDrillAWell(
		PermitToDrillAWell permitToDrillAWell) {

		return getService().updatePermitToDrillAWell(permitToDrillAWell);
	}

	public static PermitToDrillAWellLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<PermitToDrillAWellLocalService>
		_serviceSnapshot = new Snapshot<>(
			PermitToDrillAWellLocalServiceUtil.class,
			PermitToDrillAWellLocalService.class);

}