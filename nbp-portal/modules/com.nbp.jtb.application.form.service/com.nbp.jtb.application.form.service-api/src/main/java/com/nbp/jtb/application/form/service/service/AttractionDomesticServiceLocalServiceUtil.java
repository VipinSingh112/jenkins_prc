/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.jtb.application.form.service.model.AttractionDomesticService;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for AttractionDomesticService. This utility wraps
 * <code>com.nbp.jtb.application.form.service.service.impl.AttractionDomesticServiceLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see AttractionDomesticServiceLocalService
 * @generated
 */
public class AttractionDomesticServiceLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.jtb.application.form.service.service.impl.AttractionDomesticServiceLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the attraction domestic service to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttractionDomesticServiceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attractionDomesticService the attraction domestic service
	 * @return the attraction domestic service that was added
	 */
	public static AttractionDomesticService addAttractionDomesticService(
		AttractionDomesticService attractionDomesticService) {

		return getService().addAttractionDomesticService(
			attractionDomesticService);
	}

	/**
	 * Creates a new attraction domestic service with the primary key. Does not add the attraction domestic service to the database.
	 *
	 * @param attractionDomesticServId the primary key for the new attraction domestic service
	 * @return the new attraction domestic service
	 */
	public static AttractionDomesticService createAttractionDomesticService(
		long attractionDomesticServId) {

		return getService().createAttractionDomesticService(
			attractionDomesticServId);
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
	 * Deletes the attraction domestic service from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttractionDomesticServiceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attractionDomesticService the attraction domestic service
	 * @return the attraction domestic service that was removed
	 */
	public static AttractionDomesticService deleteAttractionDomesticService(
		AttractionDomesticService attractionDomesticService) {

		return getService().deleteAttractionDomesticService(
			attractionDomesticService);
	}

	/**
	 * Deletes the attraction domestic service with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttractionDomesticServiceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attractionDomesticServId the primary key of the attraction domestic service
	 * @return the attraction domestic service that was removed
	 * @throws PortalException if a attraction domestic service with the primary key could not be found
	 */
	public static AttractionDomesticService deleteAttractionDomesticService(
			long attractionDomesticServId)
		throws PortalException {

		return getService().deleteAttractionDomesticService(
			attractionDomesticServId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AttractionDomesticServiceModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AttractionDomesticServiceModelImpl</code>.
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

	public static AttractionDomesticService fetchAttractionDomesticService(
		long attractionDomesticServId) {

		return getService().fetchAttractionDomesticService(
			attractionDomesticServId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the attraction domestic service with the primary key.
	 *
	 * @param attractionDomesticServId the primary key of the attraction domestic service
	 * @return the attraction domestic service
	 * @throws PortalException if a attraction domestic service with the primary key could not be found
	 */
	public static AttractionDomesticService getAttractionDomesticService(
			long attractionDomesticServId)
		throws PortalException {

		return getService().getAttractionDomesticService(
			attractionDomesticServId);
	}

	/**
	 * Returns a range of all the attraction domestic services.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AttractionDomesticServiceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction domestic services
	 * @param end the upper bound of the range of attraction domestic services (not inclusive)
	 * @return the range of attraction domestic services
	 */
	public static List<AttractionDomesticService> getAttractionDomesticServices(
		int start, int end) {

		return getService().getAttractionDomesticServices(start, end);
	}

	/**
	 * Returns the number of attraction domestic services.
	 *
	 * @return the number of attraction domestic services
	 */
	public static int getAttractionDomesticServicesCount() {
		return getService().getAttractionDomesticServicesCount();
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	public static AttractionDomesticService getJTB_ByApplicationId(
			long jtbApplicationId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAttractionDomesticServiceException {

		return getService().getJTB_ByApplicationId(jtbApplicationId);
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
	 * Updates the attraction domestic service in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttractionDomesticServiceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attractionDomesticService the attraction domestic service
	 * @return the attraction domestic service that was updated
	 */
	public static AttractionDomesticService updateAttractionDomesticService(
		AttractionDomesticService attractionDomesticService) {

		return getService().updateAttractionDomesticService(
			attractionDomesticService);
	}

	public static AttractionDomesticServiceLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<AttractionDomesticServiceLocalService>
		_serviceSnapshot = new Snapshot<>(
			AttractionDomesticServiceLocalServiceUtil.class,
			AttractionDomesticServiceLocalService.class);

}