/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AttractionWaterGenDeclareLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AttractionWaterGenDeclareLocalService
 * @generated
 */
public class AttractionWaterGenDeclareLocalServiceWrapper
	implements AttractionWaterGenDeclareLocalService,
			   ServiceWrapper<AttractionWaterGenDeclareLocalService> {

	public AttractionWaterGenDeclareLocalServiceWrapper() {
		this(null);
	}

	public AttractionWaterGenDeclareLocalServiceWrapper(
		AttractionWaterGenDeclareLocalService
			attractionWaterGenDeclareLocalService) {

		_attractionWaterGenDeclareLocalService =
			attractionWaterGenDeclareLocalService;
	}

	/**
	 * Adds the attraction water gen declare to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttractionWaterGenDeclareLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attractionWaterGenDeclare the attraction water gen declare
	 * @return the attraction water gen declare that was added
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionWaterGenDeclare
		addAttractionWaterGenDeclare(
			com.nbp.jtb.application.form.service.model.AttractionWaterGenDeclare
				attractionWaterGenDeclare) {

		return _attractionWaterGenDeclareLocalService.
			addAttractionWaterGenDeclare(attractionWaterGenDeclare);
	}

	/**
	 * Creates a new attraction water gen declare with the primary key. Does not add the attraction water gen declare to the database.
	 *
	 * @param attractionWaterGenDeclareId the primary key for the new attraction water gen declare
	 * @return the new attraction water gen declare
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionWaterGenDeclare
		createAttractionWaterGenDeclare(long attractionWaterGenDeclareId) {

		return _attractionWaterGenDeclareLocalService.
			createAttractionWaterGenDeclare(attractionWaterGenDeclareId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attractionWaterGenDeclareLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the attraction water gen declare from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttractionWaterGenDeclareLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attractionWaterGenDeclare the attraction water gen declare
	 * @return the attraction water gen declare that was removed
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionWaterGenDeclare
		deleteAttractionWaterGenDeclare(
			com.nbp.jtb.application.form.service.model.AttractionWaterGenDeclare
				attractionWaterGenDeclare) {

		return _attractionWaterGenDeclareLocalService.
			deleteAttractionWaterGenDeclare(attractionWaterGenDeclare);
	}

	/**
	 * Deletes the attraction water gen declare with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttractionWaterGenDeclareLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attractionWaterGenDeclareId the primary key of the attraction water gen declare
	 * @return the attraction water gen declare that was removed
	 * @throws PortalException if a attraction water gen declare with the primary key could not be found
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionWaterGenDeclare
			deleteAttractionWaterGenDeclare(long attractionWaterGenDeclareId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attractionWaterGenDeclareLocalService.
			deleteAttractionWaterGenDeclare(attractionWaterGenDeclareId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attractionWaterGenDeclareLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _attractionWaterGenDeclareLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _attractionWaterGenDeclareLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _attractionWaterGenDeclareLocalService.dynamicQuery();
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

		return _attractionWaterGenDeclareLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AttractionWaterGenDeclareModelImpl</code>.
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

		return _attractionWaterGenDeclareLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AttractionWaterGenDeclareModelImpl</code>.
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

		return _attractionWaterGenDeclareLocalService.dynamicQuery(
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

		return _attractionWaterGenDeclareLocalService.dynamicQueryCount(
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

		return _attractionWaterGenDeclareLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.jtb.application.form.service.model.AttractionWaterGenDeclare
		fetchAttractionWaterGenDeclare(long attractionWaterGenDeclareId) {

		return _attractionWaterGenDeclareLocalService.
			fetchAttractionWaterGenDeclare(attractionWaterGenDeclareId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _attractionWaterGenDeclareLocalService.
			getActionableDynamicQuery();
	}

	/**
	 * Returns the attraction water gen declare with the primary key.
	 *
	 * @param attractionWaterGenDeclareId the primary key of the attraction water gen declare
	 * @return the attraction water gen declare
	 * @throws PortalException if a attraction water gen declare with the primary key could not be found
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionWaterGenDeclare
			getAttractionWaterGenDeclare(long attractionWaterGenDeclareId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attractionWaterGenDeclareLocalService.
			getAttractionWaterGenDeclare(attractionWaterGenDeclareId);
	}

	/**
	 * Returns a range of all the attraction water gen declares.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AttractionWaterGenDeclareModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction water gen declares
	 * @param end the upper bound of the range of attraction water gen declares (not inclusive)
	 * @return the range of attraction water gen declares
	 */
	@Override
	public java.util.List
		<com.nbp.jtb.application.form.service.model.AttractionWaterGenDeclare>
			getAttractionWaterGenDeclares(int start, int end) {

		return _attractionWaterGenDeclareLocalService.
			getAttractionWaterGenDeclares(start, end);
	}

	/**
	 * Returns the number of attraction water gen declares.
	 *
	 * @return the number of attraction water gen declares
	 */
	@Override
	public int getAttractionWaterGenDeclaresCount() {
		return _attractionWaterGenDeclareLocalService.
			getAttractionWaterGenDeclaresCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _attractionWaterGenDeclareLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.jtb.application.form.service.model.AttractionWaterGenDeclare
			getJTB_ByApplicationId(long jtbApplicationId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAttractionWaterGenDeclareException {

		return _attractionWaterGenDeclareLocalService.getJTB_ByApplicationId(
			jtbApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _attractionWaterGenDeclareLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attractionWaterGenDeclareLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the attraction water gen declare in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttractionWaterGenDeclareLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attractionWaterGenDeclare the attraction water gen declare
	 * @return the attraction water gen declare that was updated
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionWaterGenDeclare
		updateAttractionWaterGenDeclare(
			com.nbp.jtb.application.form.service.model.AttractionWaterGenDeclare
				attractionWaterGenDeclare) {

		return _attractionWaterGenDeclareLocalService.
			updateAttractionWaterGenDeclare(attractionWaterGenDeclare);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _attractionWaterGenDeclareLocalService.getBasePersistence();
	}

	@Override
	public AttractionWaterGenDeclareLocalService getWrappedService() {
		return _attractionWaterGenDeclareLocalService;
	}

	@Override
	public void setWrappedService(
		AttractionWaterGenDeclareLocalService
			attractionWaterGenDeclareLocalService) {

		_attractionWaterGenDeclareLocalService =
			attractionWaterGenDeclareLocalService;
	}

	private AttractionWaterGenDeclareLocalService
		_attractionWaterGenDeclareLocalService;

}