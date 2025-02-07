/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AttractionCraftTraderLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AttractionCraftTraderLocalService
 * @generated
 */
public class AttractionCraftTraderLocalServiceWrapper
	implements AttractionCraftTraderLocalService,
			   ServiceWrapper<AttractionCraftTraderLocalService> {

	public AttractionCraftTraderLocalServiceWrapper() {
		this(null);
	}

	public AttractionCraftTraderLocalServiceWrapper(
		AttractionCraftTraderLocalService attractionCraftTraderLocalService) {

		_attractionCraftTraderLocalService = attractionCraftTraderLocalService;
	}

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
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionCraftTrader
		addAttractionCraftTrader(
			com.nbp.jtb.application.form.service.model.AttractionCraftTrader
				attractionCraftTrader) {

		return _attractionCraftTraderLocalService.addAttractionCraftTrader(
			attractionCraftTrader);
	}

	/**
	 * Creates a new attraction craft trader with the primary key. Does not add the attraction craft trader to the database.
	 *
	 * @param attractionCraftTraderId the primary key for the new attraction craft trader
	 * @return the new attraction craft trader
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionCraftTrader
		createAttractionCraftTrader(long attractionCraftTraderId) {

		return _attractionCraftTraderLocalService.createAttractionCraftTrader(
			attractionCraftTraderId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attractionCraftTraderLocalService.createPersistedModel(
			primaryKeyObj);
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
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionCraftTrader
		deleteAttractionCraftTrader(
			com.nbp.jtb.application.form.service.model.AttractionCraftTrader
				attractionCraftTrader) {

		return _attractionCraftTraderLocalService.deleteAttractionCraftTrader(
			attractionCraftTrader);
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
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionCraftTrader
			deleteAttractionCraftTrader(long attractionCraftTraderId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attractionCraftTraderLocalService.deleteAttractionCraftTrader(
			attractionCraftTraderId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attractionCraftTraderLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _attractionCraftTraderLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _attractionCraftTraderLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _attractionCraftTraderLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _attractionCraftTraderLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _attractionCraftTraderLocalService.dynamicQuery(
			dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _attractionCraftTraderLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _attractionCraftTraderLocalService.dynamicQueryCount(
			dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _attractionCraftTraderLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.jtb.application.form.service.model.AttractionCraftTrader
		fetchAttractionCraftTrader(long attractionCraftTraderId) {

		return _attractionCraftTraderLocalService.fetchAttractionCraftTrader(
			attractionCraftTraderId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _attractionCraftTraderLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the attraction craft trader with the primary key.
	 *
	 * @param attractionCraftTraderId the primary key of the attraction craft trader
	 * @return the attraction craft trader
	 * @throws PortalException if a attraction craft trader with the primary key could not be found
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionCraftTrader
			getAttractionCraftTrader(long attractionCraftTraderId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attractionCraftTraderLocalService.getAttractionCraftTrader(
			attractionCraftTraderId);
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
	@Override
	public java.util.List
		<com.nbp.jtb.application.form.service.model.AttractionCraftTrader>
			getAttractionCraftTraders(int start, int end) {

		return _attractionCraftTraderLocalService.getAttractionCraftTraders(
			start, end);
	}

	/**
	 * Returns the number of attraction craft traders.
	 *
	 * @return the number of attraction craft traders
	 */
	@Override
	public int getAttractionCraftTradersCount() {
		return _attractionCraftTraderLocalService.
			getAttractionCraftTradersCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _attractionCraftTraderLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.jtb.application.form.service.model.AttractionCraftTrader
			getJTB_ByApplicationId(long jtbApplicationId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAttractionCraftTraderException {

		return _attractionCraftTraderLocalService.getJTB_ByApplicationId(
			jtbApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _attractionCraftTraderLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attractionCraftTraderLocalService.getPersistedModel(
			primaryKeyObj);
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
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionCraftTrader
		updateAttractionCraftTrader(
			com.nbp.jtb.application.form.service.model.AttractionCraftTrader
				attractionCraftTrader) {

		return _attractionCraftTraderLocalService.updateAttractionCraftTrader(
			attractionCraftTrader);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _attractionCraftTraderLocalService.getBasePersistence();
	}

	@Override
	public AttractionCraftTraderLocalService getWrappedService() {
		return _attractionCraftTraderLocalService;
	}

	@Override
	public void setWrappedService(
		AttractionCraftTraderLocalService attractionCraftTraderLocalService) {

		_attractionCraftTraderLocalService = attractionCraftTraderLocalService;
	}

	private AttractionCraftTraderLocalService
		_attractionCraftTraderLocalService;

}