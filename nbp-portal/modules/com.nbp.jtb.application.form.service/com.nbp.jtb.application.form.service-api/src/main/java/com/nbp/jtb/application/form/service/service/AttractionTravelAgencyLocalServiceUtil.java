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

import com.nbp.jtb.application.form.service.model.AttractionTravelAgency;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for AttractionTravelAgency. This utility wraps
 * <code>com.nbp.jtb.application.form.service.service.impl.AttractionTravelAgencyLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see AttractionTravelAgencyLocalService
 * @generated
 */
public class AttractionTravelAgencyLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.jtb.application.form.service.service.impl.AttractionTravelAgencyLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the attraction travel agency to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttractionTravelAgencyLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attractionTravelAgency the attraction travel agency
	 * @return the attraction travel agency that was added
	 */
	public static AttractionTravelAgency addAttractionTravelAgency(
		AttractionTravelAgency attractionTravelAgency) {

		return getService().addAttractionTravelAgency(attractionTravelAgency);
	}

	/**
	 * Creates a new attraction travel agency with the primary key. Does not add the attraction travel agency to the database.
	 *
	 * @param attractionTravelAgencyId the primary key for the new attraction travel agency
	 * @return the new attraction travel agency
	 */
	public static AttractionTravelAgency createAttractionTravelAgency(
		long attractionTravelAgencyId) {

		return getService().createAttractionTravelAgency(
			attractionTravelAgencyId);
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
	 * Deletes the attraction travel agency from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttractionTravelAgencyLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attractionTravelAgency the attraction travel agency
	 * @return the attraction travel agency that was removed
	 */
	public static AttractionTravelAgency deleteAttractionTravelAgency(
		AttractionTravelAgency attractionTravelAgency) {

		return getService().deleteAttractionTravelAgency(
			attractionTravelAgency);
	}

	/**
	 * Deletes the attraction travel agency with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttractionTravelAgencyLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attractionTravelAgencyId the primary key of the attraction travel agency
	 * @return the attraction travel agency that was removed
	 * @throws PortalException if a attraction travel agency with the primary key could not be found
	 */
	public static AttractionTravelAgency deleteAttractionTravelAgency(
			long attractionTravelAgencyId)
		throws PortalException {

		return getService().deleteAttractionTravelAgency(
			attractionTravelAgencyId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AttractionTravelAgencyModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AttractionTravelAgencyModelImpl</code>.
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

	public static AttractionTravelAgency fetchAttractionTravelAgency(
		long attractionTravelAgencyId) {

		return getService().fetchAttractionTravelAgency(
			attractionTravelAgencyId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns a range of all the attraction travel agencies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AttractionTravelAgencyModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction travel agencies
	 * @param end the upper bound of the range of attraction travel agencies (not inclusive)
	 * @return the range of attraction travel agencies
	 */
	public static List<AttractionTravelAgency> getAttractionTravelAgencies(
		int start, int end) {

		return getService().getAttractionTravelAgencies(start, end);
	}

	/**
	 * Returns the number of attraction travel agencies.
	 *
	 * @return the number of attraction travel agencies
	 */
	public static int getAttractionTravelAgenciesCount() {
		return getService().getAttractionTravelAgenciesCount();
	}

	/**
	 * Returns the attraction travel agency with the primary key.
	 *
	 * @param attractionTravelAgencyId the primary key of the attraction travel agency
	 * @return the attraction travel agency
	 * @throws PortalException if a attraction travel agency with the primary key could not be found
	 */
	public static AttractionTravelAgency getAttractionTravelAgency(
			long attractionTravelAgencyId)
		throws PortalException {

		return getService().getAttractionTravelAgency(attractionTravelAgencyId);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	public static AttractionTravelAgency getJTB_ByApplicationId(
			long jtbApplicationId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAttractionTravelAgencyException {

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
	 * Updates the attraction travel agency in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttractionTravelAgencyLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attractionTravelAgency the attraction travel agency
	 * @return the attraction travel agency that was updated
	 */
	public static AttractionTravelAgency updateAttractionTravelAgency(
		AttractionTravelAgency attractionTravelAgency) {

		return getService().updateAttractionTravelAgency(
			attractionTravelAgency);
	}

	public static AttractionTravelAgencyLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<AttractionTravelAgencyLocalService>
		_serviceSnapshot = new Snapshot<>(
			AttractionTravelAgencyLocalServiceUtil.class,
			AttractionTravelAgencyLocalService.class);

}