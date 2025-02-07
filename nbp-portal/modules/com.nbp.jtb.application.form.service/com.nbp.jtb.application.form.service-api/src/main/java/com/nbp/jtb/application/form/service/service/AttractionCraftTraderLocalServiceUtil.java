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

import com.nbp.jtb.application.form.service.model.AttractionCraftTrader;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for AttractionCraftTrader. This utility wraps
 * <code>com.nbp.jtb.application.form.service.service.impl.AttractionCraftTraderLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see AttractionCraftTraderLocalService
 * @generated
 */
public class AttractionCraftTraderLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.jtb.application.form.service.service.impl.AttractionCraftTraderLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the attraction craft trader to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttractionCraftTraderLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attractionCraftTrader the attraction craft trader
	 * @return the attraction craft trader that was added
	 */
	public static AttractionCraftTrader addAttractionCraftTrader(
		AttractionCraftTrader attractionCraftTrader) {

		return getService().addAttractionCraftTrader(attractionCraftTrader);
	}

	/**
	 * Creates a new attraction craft trader with the primary key. Does not add the attraction craft trader to the database.
	 *
	 * @param attractionCraftTraderId the primary key for the new attraction craft trader
	 * @return the new attraction craft trader
	 */
	public static AttractionCraftTrader createAttractionCraftTrader(
		long attractionCraftTraderId) {

		return getService().createAttractionCraftTrader(
			attractionCraftTraderId);
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
	 * Deletes the attraction craft trader from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttractionCraftTraderLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attractionCraftTrader the attraction craft trader
	 * @return the attraction craft trader that was removed
	 */
	public static AttractionCraftTrader deleteAttractionCraftTrader(
		AttractionCraftTrader attractionCraftTrader) {

		return getService().deleteAttractionCraftTrader(attractionCraftTrader);
	}

	/**
	 * Deletes the attraction craft trader with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttractionCraftTraderLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attractionCraftTraderId the primary key of the attraction craft trader
	 * @return the attraction craft trader that was removed
	 * @throws PortalException if a attraction craft trader with the primary key could not be found
	 */
	public static AttractionCraftTrader deleteAttractionCraftTrader(
			long attractionCraftTraderId)
		throws PortalException {

		return getService().deleteAttractionCraftTrader(
			attractionCraftTraderId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AttractionCraftTraderModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AttractionCraftTraderModelImpl</code>.
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

	public static AttractionCraftTrader fetchAttractionCraftTrader(
		long attractionCraftTraderId) {

		return getService().fetchAttractionCraftTrader(attractionCraftTraderId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the attraction craft trader with the primary key.
	 *
	 * @param attractionCraftTraderId the primary key of the attraction craft trader
	 * @return the attraction craft trader
	 * @throws PortalException if a attraction craft trader with the primary key could not be found
	 */
	public static AttractionCraftTrader getAttractionCraftTrader(
			long attractionCraftTraderId)
		throws PortalException {

		return getService().getAttractionCraftTrader(attractionCraftTraderId);
	}

	/**
	 * Returns a range of all the attraction craft traders.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AttractionCraftTraderModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction craft traders
	 * @param end the upper bound of the range of attraction craft traders (not inclusive)
	 * @return the range of attraction craft traders
	 */
	public static List<AttractionCraftTrader> getAttractionCraftTraders(
		int start, int end) {

		return getService().getAttractionCraftTraders(start, end);
	}

	/**
	 * Returns the number of attraction craft traders.
	 *
	 * @return the number of attraction craft traders
	 */
	public static int getAttractionCraftTradersCount() {
		return getService().getAttractionCraftTradersCount();
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	public static AttractionCraftTrader getJTB_ByApplicationId(
			long jtbApplicationId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAttractionCraftTraderException {

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
	 * Updates the attraction craft trader in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttractionCraftTraderLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attractionCraftTrader the attraction craft trader
	 * @return the attraction craft trader that was updated
	 */
	public static AttractionCraftTrader updateAttractionCraftTrader(
		AttractionCraftTrader attractionCraftTrader) {

		return getService().updateAttractionCraftTrader(attractionCraftTrader);
	}

	public static AttractionCraftTraderLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<AttractionCraftTraderLocalService>
		_serviceSnapshot = new Snapshot<>(
			AttractionCraftTraderLocalServiceUtil.class,
			AttractionCraftTraderLocalService.class);

}