/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AttractionCarRentConditionLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AttractionCarRentConditionLocalService
 * @generated
 */
public class AttractionCarRentConditionLocalServiceWrapper
	implements AttractionCarRentConditionLocalService,
			   ServiceWrapper<AttractionCarRentConditionLocalService> {

	public AttractionCarRentConditionLocalServiceWrapper() {
		this(null);
	}

	public AttractionCarRentConditionLocalServiceWrapper(
		AttractionCarRentConditionLocalService
			attractionCarRentConditionLocalService) {

		_attractionCarRentConditionLocalService =
			attractionCarRentConditionLocalService;
	}

	/**
	 * Adds the attraction car rent condition to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttractionCarRentConditionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attractionCarRentCondition the attraction car rent condition
	 * @return the attraction car rent condition that was added
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionCarRentCondition
		addAttractionCarRentCondition(
			com.nbp.jtb.application.form.service.model.
				AttractionCarRentCondition attractionCarRentCondition) {

		return _attractionCarRentConditionLocalService.
			addAttractionCarRentCondition(attractionCarRentCondition);
	}

	/**
	 * Creates a new attraction car rent condition with the primary key. Does not add the attraction car rent condition to the database.
	 *
	 * @param attractionCarRenConditId the primary key for the new attraction car rent condition
	 * @return the new attraction car rent condition
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionCarRentCondition
		createAttractionCarRentCondition(long attractionCarRenConditId) {

		return _attractionCarRentConditionLocalService.
			createAttractionCarRentCondition(attractionCarRenConditId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attractionCarRentConditionLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the attraction car rent condition from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttractionCarRentConditionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attractionCarRentCondition the attraction car rent condition
	 * @return the attraction car rent condition that was removed
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionCarRentCondition
		deleteAttractionCarRentCondition(
			com.nbp.jtb.application.form.service.model.
				AttractionCarRentCondition attractionCarRentCondition) {

		return _attractionCarRentConditionLocalService.
			deleteAttractionCarRentCondition(attractionCarRentCondition);
	}

	/**
	 * Deletes the attraction car rent condition with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttractionCarRentConditionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attractionCarRenConditId the primary key of the attraction car rent condition
	 * @return the attraction car rent condition that was removed
	 * @throws PortalException if a attraction car rent condition with the primary key could not be found
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionCarRentCondition
			deleteAttractionCarRentCondition(long attractionCarRenConditId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attractionCarRentConditionLocalService.
			deleteAttractionCarRentCondition(attractionCarRenConditId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attractionCarRentConditionLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _attractionCarRentConditionLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _attractionCarRentConditionLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _attractionCarRentConditionLocalService.dynamicQuery();
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

		return _attractionCarRentConditionLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AttractionCarRentConditionModelImpl</code>.
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

		return _attractionCarRentConditionLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AttractionCarRentConditionModelImpl</code>.
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

		return _attractionCarRentConditionLocalService.dynamicQuery(
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

		return _attractionCarRentConditionLocalService.dynamicQueryCount(
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

		return _attractionCarRentConditionLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.jtb.application.form.service.model.AttractionCarRentCondition
		fetchAttractionCarRentCondition(long attractionCarRenConditId) {

		return _attractionCarRentConditionLocalService.
			fetchAttractionCarRentCondition(attractionCarRenConditId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _attractionCarRentConditionLocalService.
			getActionableDynamicQuery();
	}

	/**
	 * Returns the attraction car rent condition with the primary key.
	 *
	 * @param attractionCarRenConditId the primary key of the attraction car rent condition
	 * @return the attraction car rent condition
	 * @throws PortalException if a attraction car rent condition with the primary key could not be found
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionCarRentCondition
			getAttractionCarRentCondition(long attractionCarRenConditId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attractionCarRentConditionLocalService.
			getAttractionCarRentCondition(attractionCarRenConditId);
	}

	/**
	 * Returns a range of all the attraction car rent conditions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AttractionCarRentConditionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction car rent conditions
	 * @param end the upper bound of the range of attraction car rent conditions (not inclusive)
	 * @return the range of attraction car rent conditions
	 */
	@Override
	public java.util.List
		<com.nbp.jtb.application.form.service.model.AttractionCarRentCondition>
			getAttractionCarRentConditions(int start, int end) {

		return _attractionCarRentConditionLocalService.
			getAttractionCarRentConditions(start, end);
	}

	/**
	 * Returns the number of attraction car rent conditions.
	 *
	 * @return the number of attraction car rent conditions
	 */
	@Override
	public int getAttractionCarRentConditionsCount() {
		return _attractionCarRentConditionLocalService.
			getAttractionCarRentConditionsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _attractionCarRentConditionLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.jtb.application.form.service.model.AttractionCarRentCondition
			getJTB_ByApplicationId(long jtbApplicationId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAttractionCarRentConditionException {

		return _attractionCarRentConditionLocalService.getJTB_ByApplicationId(
			jtbApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _attractionCarRentConditionLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attractionCarRentConditionLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the attraction car rent condition in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttractionCarRentConditionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attractionCarRentCondition the attraction car rent condition
	 * @return the attraction car rent condition that was updated
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionCarRentCondition
		updateAttractionCarRentCondition(
			com.nbp.jtb.application.form.service.model.
				AttractionCarRentCondition attractionCarRentCondition) {

		return _attractionCarRentConditionLocalService.
			updateAttractionCarRentCondition(attractionCarRentCondition);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _attractionCarRentConditionLocalService.getBasePersistence();
	}

	@Override
	public AttractionCarRentConditionLocalService getWrappedService() {
		return _attractionCarRentConditionLocalService;
	}

	@Override
	public void setWrappedService(
		AttractionCarRentConditionLocalService
			attractionCarRentConditionLocalService) {

		_attractionCarRentConditionLocalService =
			attractionCarRentConditionLocalService;
	}

	private AttractionCarRentConditionLocalService
		_attractionCarRentConditionLocalService;

}