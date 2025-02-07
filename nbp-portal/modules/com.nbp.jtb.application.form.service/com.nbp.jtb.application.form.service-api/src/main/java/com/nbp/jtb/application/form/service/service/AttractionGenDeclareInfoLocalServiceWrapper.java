/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AttractionGenDeclareInfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AttractionGenDeclareInfoLocalService
 * @generated
 */
public class AttractionGenDeclareInfoLocalServiceWrapper
	implements AttractionGenDeclareInfoLocalService,
			   ServiceWrapper<AttractionGenDeclareInfoLocalService> {

	public AttractionGenDeclareInfoLocalServiceWrapper() {
		this(null);
	}

	public AttractionGenDeclareInfoLocalServiceWrapper(
		AttractionGenDeclareInfoLocalService
			attractionGenDeclareInfoLocalService) {

		_attractionGenDeclareInfoLocalService =
			attractionGenDeclareInfoLocalService;
	}

	/**
	 * Adds the attraction gen declare info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttractionGenDeclareInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attractionGenDeclareInfo the attraction gen declare info
	 * @return the attraction gen declare info that was added
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionGenDeclareInfo
		addAttractionGenDeclareInfo(
			com.nbp.jtb.application.form.service.model.AttractionGenDeclareInfo
				attractionGenDeclareInfo) {

		return _attractionGenDeclareInfoLocalService.
			addAttractionGenDeclareInfo(attractionGenDeclareInfo);
	}

	/**
	 * Creates a new attraction gen declare info with the primary key. Does not add the attraction gen declare info to the database.
	 *
	 * @param attractionGenDeclareInfoId the primary key for the new attraction gen declare info
	 * @return the new attraction gen declare info
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionGenDeclareInfo
		createAttractionGenDeclareInfo(long attractionGenDeclareInfoId) {

		return _attractionGenDeclareInfoLocalService.
			createAttractionGenDeclareInfo(attractionGenDeclareInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attractionGenDeclareInfoLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the attraction gen declare info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttractionGenDeclareInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attractionGenDeclareInfo the attraction gen declare info
	 * @return the attraction gen declare info that was removed
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionGenDeclareInfo
		deleteAttractionGenDeclareInfo(
			com.nbp.jtb.application.form.service.model.AttractionGenDeclareInfo
				attractionGenDeclareInfo) {

		return _attractionGenDeclareInfoLocalService.
			deleteAttractionGenDeclareInfo(attractionGenDeclareInfo);
	}

	/**
	 * Deletes the attraction gen declare info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttractionGenDeclareInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attractionGenDeclareInfoId the primary key of the attraction gen declare info
	 * @return the attraction gen declare info that was removed
	 * @throws PortalException if a attraction gen declare info with the primary key could not be found
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionGenDeclareInfo
			deleteAttractionGenDeclareInfo(long attractionGenDeclareInfoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attractionGenDeclareInfoLocalService.
			deleteAttractionGenDeclareInfo(attractionGenDeclareInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attractionGenDeclareInfoLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _attractionGenDeclareInfoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _attractionGenDeclareInfoLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _attractionGenDeclareInfoLocalService.dynamicQuery();
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

		return _attractionGenDeclareInfoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AttractionGenDeclareInfoModelImpl</code>.
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

		return _attractionGenDeclareInfoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AttractionGenDeclareInfoModelImpl</code>.
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

		return _attractionGenDeclareInfoLocalService.dynamicQuery(
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

		return _attractionGenDeclareInfoLocalService.dynamicQueryCount(
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

		return _attractionGenDeclareInfoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.jtb.application.form.service.model.AttractionGenDeclareInfo
		fetchAttractionGenDeclareInfo(long attractionGenDeclareInfoId) {

		return _attractionGenDeclareInfoLocalService.
			fetchAttractionGenDeclareInfo(attractionGenDeclareInfoId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _attractionGenDeclareInfoLocalService.
			getActionableDynamicQuery();
	}

	/**
	 * Returns the attraction gen declare info with the primary key.
	 *
	 * @param attractionGenDeclareInfoId the primary key of the attraction gen declare info
	 * @return the attraction gen declare info
	 * @throws PortalException if a attraction gen declare info with the primary key could not be found
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionGenDeclareInfo
			getAttractionGenDeclareInfo(long attractionGenDeclareInfoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attractionGenDeclareInfoLocalService.
			getAttractionGenDeclareInfo(attractionGenDeclareInfoId);
	}

	/**
	 * Returns a range of all the attraction gen declare infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AttractionGenDeclareInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction gen declare infos
	 * @param end the upper bound of the range of attraction gen declare infos (not inclusive)
	 * @return the range of attraction gen declare infos
	 */
	@Override
	public java.util.List
		<com.nbp.jtb.application.form.service.model.AttractionGenDeclareInfo>
			getAttractionGenDeclareInfos(int start, int end) {

		return _attractionGenDeclareInfoLocalService.
			getAttractionGenDeclareInfos(start, end);
	}

	/**
	 * Returns the number of attraction gen declare infos.
	 *
	 * @return the number of attraction gen declare infos
	 */
	@Override
	public int getAttractionGenDeclareInfosCount() {
		return _attractionGenDeclareInfoLocalService.
			getAttractionGenDeclareInfosCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _attractionGenDeclareInfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.jtb.application.form.service.model.AttractionGenDeclareInfo
			getJTB_ByApplicationId(long jtbApplicationId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAttractionGenDeclareInfoException {

		return _attractionGenDeclareInfoLocalService.getJTB_ByApplicationId(
			jtbApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _attractionGenDeclareInfoLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attractionGenDeclareInfoLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the attraction gen declare info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttractionGenDeclareInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attractionGenDeclareInfo the attraction gen declare info
	 * @return the attraction gen declare info that was updated
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionGenDeclareInfo
		updateAttractionGenDeclareInfo(
			com.nbp.jtb.application.form.service.model.AttractionGenDeclareInfo
				attractionGenDeclareInfo) {

		return _attractionGenDeclareInfoLocalService.
			updateAttractionGenDeclareInfo(attractionGenDeclareInfo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _attractionGenDeclareInfoLocalService.getBasePersistence();
	}

	@Override
	public AttractionGenDeclareInfoLocalService getWrappedService() {
		return _attractionGenDeclareInfoLocalService;
	}

	@Override
	public void setWrappedService(
		AttractionGenDeclareInfoLocalService
			attractionGenDeclareInfoLocalService) {

		_attractionGenDeclareInfoLocalService =
			attractionGenDeclareInfoLocalService;
	}

	private AttractionGenDeclareInfoLocalService
		_attractionGenDeclareInfoLocalService;

}