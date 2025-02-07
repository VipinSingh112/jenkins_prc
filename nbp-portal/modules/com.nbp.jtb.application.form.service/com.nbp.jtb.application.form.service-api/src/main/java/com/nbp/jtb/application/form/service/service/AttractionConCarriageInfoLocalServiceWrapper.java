/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AttractionConCarriageInfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AttractionConCarriageInfoLocalService
 * @generated
 */
public class AttractionConCarriageInfoLocalServiceWrapper
	implements AttractionConCarriageInfoLocalService,
			   ServiceWrapper<AttractionConCarriageInfoLocalService> {

	public AttractionConCarriageInfoLocalServiceWrapper() {
		this(null);
	}

	public AttractionConCarriageInfoLocalServiceWrapper(
		AttractionConCarriageInfoLocalService
			attractionConCarriageInfoLocalService) {

		_attractionConCarriageInfoLocalService =
			attractionConCarriageInfoLocalService;
	}

	/**
	 * Adds the attraction con carriage info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttractionConCarriageInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attractionConCarriageInfo the attraction con carriage info
	 * @return the attraction con carriage info that was added
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionConCarriageInfo
		addAttractionConCarriageInfo(
			com.nbp.jtb.application.form.service.model.AttractionConCarriageInfo
				attractionConCarriageInfo) {

		return _attractionConCarriageInfoLocalService.
			addAttractionConCarriageInfo(attractionConCarriageInfo);
	}

	/**
	 * Creates a new attraction con carriage info with the primary key. Does not add the attraction con carriage info to the database.
	 *
	 * @param attractionConCarriageInfoId the primary key for the new attraction con carriage info
	 * @return the new attraction con carriage info
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionConCarriageInfo
		createAttractionConCarriageInfo(long attractionConCarriageInfoId) {

		return _attractionConCarriageInfoLocalService.
			createAttractionConCarriageInfo(attractionConCarriageInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attractionConCarriageInfoLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the attraction con carriage info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttractionConCarriageInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attractionConCarriageInfo the attraction con carriage info
	 * @return the attraction con carriage info that was removed
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionConCarriageInfo
		deleteAttractionConCarriageInfo(
			com.nbp.jtb.application.form.service.model.AttractionConCarriageInfo
				attractionConCarriageInfo) {

		return _attractionConCarriageInfoLocalService.
			deleteAttractionConCarriageInfo(attractionConCarriageInfo);
	}

	/**
	 * Deletes the attraction con carriage info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttractionConCarriageInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attractionConCarriageInfoId the primary key of the attraction con carriage info
	 * @return the attraction con carriage info that was removed
	 * @throws PortalException if a attraction con carriage info with the primary key could not be found
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionConCarriageInfo
			deleteAttractionConCarriageInfo(long attractionConCarriageInfoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attractionConCarriageInfoLocalService.
			deleteAttractionConCarriageInfo(attractionConCarriageInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attractionConCarriageInfoLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _attractionConCarriageInfoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _attractionConCarriageInfoLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _attractionConCarriageInfoLocalService.dynamicQuery();
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

		return _attractionConCarriageInfoLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AttractionConCarriageInfoModelImpl</code>.
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

		return _attractionConCarriageInfoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AttractionConCarriageInfoModelImpl</code>.
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

		return _attractionConCarriageInfoLocalService.dynamicQuery(
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

		return _attractionConCarriageInfoLocalService.dynamicQueryCount(
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

		return _attractionConCarriageInfoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.jtb.application.form.service.model.AttractionConCarriageInfo
		fetchAttractionConCarriageInfo(long attractionConCarriageInfoId) {

		return _attractionConCarriageInfoLocalService.
			fetchAttractionConCarriageInfo(attractionConCarriageInfoId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _attractionConCarriageInfoLocalService.
			getActionableDynamicQuery();
	}

	/**
	 * Returns the attraction con carriage info with the primary key.
	 *
	 * @param attractionConCarriageInfoId the primary key of the attraction con carriage info
	 * @return the attraction con carriage info
	 * @throws PortalException if a attraction con carriage info with the primary key could not be found
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionConCarriageInfo
			getAttractionConCarriageInfo(long attractionConCarriageInfoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attractionConCarriageInfoLocalService.
			getAttractionConCarriageInfo(attractionConCarriageInfoId);
	}

	/**
	 * Returns a range of all the attraction con carriage infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AttractionConCarriageInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction con carriage infos
	 * @param end the upper bound of the range of attraction con carriage infos (not inclusive)
	 * @return the range of attraction con carriage infos
	 */
	@Override
	public java.util.List
		<com.nbp.jtb.application.form.service.model.AttractionConCarriageInfo>
			getAttractionConCarriageInfos(int start, int end) {

		return _attractionConCarriageInfoLocalService.
			getAttractionConCarriageInfos(start, end);
	}

	/**
	 * Returns the number of attraction con carriage infos.
	 *
	 * @return the number of attraction con carriage infos
	 */
	@Override
	public int getAttractionConCarriageInfosCount() {
		return _attractionConCarriageInfoLocalService.
			getAttractionConCarriageInfosCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _attractionConCarriageInfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.jtb.application.form.service.model.AttractionConCarriageInfo
			getJTB_ByApplicationId(long jtbApplicationId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAttractionConCarriageInfoException {

		return _attractionConCarriageInfoLocalService.getJTB_ByApplicationId(
			jtbApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _attractionConCarriageInfoLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attractionConCarriageInfoLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the attraction con carriage info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttractionConCarriageInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attractionConCarriageInfo the attraction con carriage info
	 * @return the attraction con carriage info that was updated
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionConCarriageInfo
		updateAttractionConCarriageInfo(
			com.nbp.jtb.application.form.service.model.AttractionConCarriageInfo
				attractionConCarriageInfo) {

		return _attractionConCarriageInfoLocalService.
			updateAttractionConCarriageInfo(attractionConCarriageInfo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _attractionConCarriageInfoLocalService.getBasePersistence();
	}

	@Override
	public AttractionConCarriageInfoLocalService getWrappedService() {
		return _attractionConCarriageInfoLocalService;
	}

	@Override
	public void setWrappedService(
		AttractionConCarriageInfoLocalService
			attractionConCarriageInfoLocalService) {

		_attractionConCarriageInfoLocalService =
			attractionConCarriageInfoLocalService;
	}

	private AttractionConCarriageInfoLocalService
		_attractionConCarriageInfoLocalService;

}