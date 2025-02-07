/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quary.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link QuarryMaterialInformationEquipmentListLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see QuarryMaterialInformationEquipmentListLocalService
 * @generated
 */
public class QuarryMaterialInformationEquipmentListLocalServiceWrapper
	implements QuarryMaterialInformationEquipmentListLocalService,
			   ServiceWrapper
				   <QuarryMaterialInformationEquipmentListLocalService> {

	public QuarryMaterialInformationEquipmentListLocalServiceWrapper() {
		this(null);
	}

	public QuarryMaterialInformationEquipmentListLocalServiceWrapper(
		QuarryMaterialInformationEquipmentListLocalService
			quarryMaterialInformationEquipmentListLocalService) {

		_quarryMaterialInformationEquipmentListLocalService =
			quarryMaterialInformationEquipmentListLocalService;
	}

	/**
	 * Adds the quarry material information equipment list to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryMaterialInformationEquipmentListLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryMaterialInformationEquipmentList the quarry material information equipment list
	 * @return the quarry material information equipment list that was added
	 */
	@Override
	public com.nbp.quary.application.form.service.model.
		QuarryMaterialInformationEquipmentList
			addQuarryMaterialInformationEquipmentList(
				com.nbp.quary.application.form.service.model.
					QuarryMaterialInformationEquipmentList
						quarryMaterialInformationEquipmentList) {

		return _quarryMaterialInformationEquipmentListLocalService.
			addQuarryMaterialInformationEquipmentList(
				quarryMaterialInformationEquipmentList);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _quarryMaterialInformationEquipmentListLocalService.
			createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new quarry material information equipment list with the primary key. Does not add the quarry material information equipment list to the database.
	 *
	 * @param materialInfoId the primary key for the new quarry material information equipment list
	 * @return the new quarry material information equipment list
	 */
	@Override
	public com.nbp.quary.application.form.service.model.
		QuarryMaterialInformationEquipmentList
			createQuarryMaterialInformationEquipmentList(long materialInfoId) {

		return _quarryMaterialInformationEquipmentListLocalService.
			createQuarryMaterialInformationEquipmentList(materialInfoId);
	}

	@Override
	public void delete_QuarryMaterialInformationEquipmentList_By_Id(
		long quarryApplicationId) {

		_quarryMaterialInformationEquipmentListLocalService.
			delete_QuarryMaterialInformationEquipmentList_By_Id(
				quarryApplicationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _quarryMaterialInformationEquipmentListLocalService.
			deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the quarry material information equipment list with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryMaterialInformationEquipmentListLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param materialInfoId the primary key of the quarry material information equipment list
	 * @return the quarry material information equipment list that was removed
	 * @throws PortalException if a quarry material information equipment list with the primary key could not be found
	 */
	@Override
	public com.nbp.quary.application.form.service.model.
		QuarryMaterialInformationEquipmentList
				deleteQuarryMaterialInformationEquipmentList(
					long materialInfoId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _quarryMaterialInformationEquipmentListLocalService.
			deleteQuarryMaterialInformationEquipmentList(materialInfoId);
	}

	/**
	 * Deletes the quarry material information equipment list from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryMaterialInformationEquipmentListLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryMaterialInformationEquipmentList the quarry material information equipment list
	 * @return the quarry material information equipment list that was removed
	 */
	@Override
	public com.nbp.quary.application.form.service.model.
		QuarryMaterialInformationEquipmentList
			deleteQuarryMaterialInformationEquipmentList(
				com.nbp.quary.application.form.service.model.
					QuarryMaterialInformationEquipmentList
						quarryMaterialInformationEquipmentList) {

		return _quarryMaterialInformationEquipmentListLocalService.
			deleteQuarryMaterialInformationEquipmentList(
				quarryMaterialInformationEquipmentList);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _quarryMaterialInformationEquipmentListLocalService.dslQuery(
			dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _quarryMaterialInformationEquipmentListLocalService.
			dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _quarryMaterialInformationEquipmentListLocalService.
			dynamicQuery();
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

		return _quarryMaterialInformationEquipmentListLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.quary.application.form.service.model.impl.QuarryMaterialInformationEquipmentListModelImpl</code>.
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

		return _quarryMaterialInformationEquipmentListLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.quary.application.form.service.model.impl.QuarryMaterialInformationEquipmentListModelImpl</code>.
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

		return _quarryMaterialInformationEquipmentListLocalService.dynamicQuery(
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

		return _quarryMaterialInformationEquipmentListLocalService.
			dynamicQueryCount(dynamicQuery);
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

		return _quarryMaterialInformationEquipmentListLocalService.
			dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.nbp.quary.application.form.service.model.
		QuarryMaterialInformationEquipmentList
			fetchQuarryMaterialInformationEquipmentList(long materialInfoId) {

		return _quarryMaterialInformationEquipmentListLocalService.
			fetchQuarryMaterialInformationEquipmentList(materialInfoId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _quarryMaterialInformationEquipmentListLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _quarryMaterialInformationEquipmentListLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _quarryMaterialInformationEquipmentListLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _quarryMaterialInformationEquipmentListLocalService.
			getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the quarry material information equipment list with the primary key.
	 *
	 * @param materialInfoId the primary key of the quarry material information equipment list
	 * @return the quarry material information equipment list
	 * @throws PortalException if a quarry material information equipment list with the primary key could not be found
	 */
	@Override
	public com.nbp.quary.application.form.service.model.
		QuarryMaterialInformationEquipmentList
				getQuarryMaterialInformationEquipmentList(long materialInfoId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _quarryMaterialInformationEquipmentListLocalService.
			getQuarryMaterialInformationEquipmentList(materialInfoId);
	}

	/**
	 * Returns a range of all the quarry material information equipment lists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.quary.application.form.service.model.impl.QuarryMaterialInformationEquipmentListModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry material information equipment lists
	 * @param end the upper bound of the range of quarry material information equipment lists (not inclusive)
	 * @return the range of quarry material information equipment lists
	 */
	@Override
	public java.util.List
		<com.nbp.quary.application.form.service.model.
			QuarryMaterialInformationEquipmentList>
				getQuarryMaterialInformationEquipmentLists(int start, int end) {

		return _quarryMaterialInformationEquipmentListLocalService.
			getQuarryMaterialInformationEquipmentLists(start, end);
	}

	/**
	 * Returns the number of quarry material information equipment lists.
	 *
	 * @return the number of quarry material information equipment lists
	 */
	@Override
	public int getQuarryMaterialInformationEquipmentListsCount() {
		return _quarryMaterialInformationEquipmentListLocalService.
			getQuarryMaterialInformationEquipmentListsCount();
	}

	@Override
	public java.util.List
		<com.nbp.quary.application.form.service.model.
			QuarryMaterialInformationEquipmentList> getQuarryMaterialList_By_Id(
				long quarryApplicationId) {

		return _quarryMaterialInformationEquipmentListLocalService.
			getQuarryMaterialList_By_Id(quarryApplicationId);
	}

	/**
	 * Updates the quarry material information equipment list in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryMaterialInformationEquipmentListLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryMaterialInformationEquipmentList the quarry material information equipment list
	 * @return the quarry material information equipment list that was updated
	 */
	@Override
	public com.nbp.quary.application.form.service.model.
		QuarryMaterialInformationEquipmentList
			updateQuarryMaterialInformationEquipmentList(
				com.nbp.quary.application.form.service.model.
					QuarryMaterialInformationEquipmentList
						quarryMaterialInformationEquipmentList) {

		return _quarryMaterialInformationEquipmentListLocalService.
			updateQuarryMaterialInformationEquipmentList(
				quarryMaterialInformationEquipmentList);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _quarryMaterialInformationEquipmentListLocalService.
			getBasePersistence();
	}

	@Override
	public QuarryMaterialInformationEquipmentListLocalService
		getWrappedService() {

		return _quarryMaterialInformationEquipmentListLocalService;
	}

	@Override
	public void setWrappedService(
		QuarryMaterialInformationEquipmentListLocalService
			quarryMaterialInformationEquipmentListLocalService) {

		_quarryMaterialInformationEquipmentListLocalService =
			quarryMaterialInformationEquipmentListLocalService;
	}

	private QuarryMaterialInformationEquipmentListLocalService
		_quarryMaterialInformationEquipmentListLocalService;

}