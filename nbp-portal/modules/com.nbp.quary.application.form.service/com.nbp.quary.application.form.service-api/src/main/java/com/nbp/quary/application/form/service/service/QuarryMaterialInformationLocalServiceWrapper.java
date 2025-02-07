/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quary.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link QuarryMaterialInformationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see QuarryMaterialInformationLocalService
 * @generated
 */
public class QuarryMaterialInformationLocalServiceWrapper
	implements QuarryMaterialInformationLocalService,
			   ServiceWrapper<QuarryMaterialInformationLocalService> {

	public QuarryMaterialInformationLocalServiceWrapper() {
		this(null);
	}

	public QuarryMaterialInformationLocalServiceWrapper(
		QuarryMaterialInformationLocalService
			quarryMaterialInformationLocalService) {

		_quarryMaterialInformationLocalService =
			quarryMaterialInformationLocalService;
	}

	/**
	 * Adds the quarry material information to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryMaterialInformationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryMaterialInformation the quarry material information
	 * @return the quarry material information that was added
	 */
	@Override
	public
		com.nbp.quary.application.form.service.model.QuarryMaterialInformation
			addQuarryMaterialInformation(
				com.nbp.quary.application.form.service.model.
					QuarryMaterialInformation quarryMaterialInformation) {

		return _quarryMaterialInformationLocalService.
			addQuarryMaterialInformation(quarryMaterialInformation);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _quarryMaterialInformationLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new quarry material information with the primary key. Does not add the quarry material information to the database.
	 *
	 * @param materialInfoId the primary key for the new quarry material information
	 * @return the new quarry material information
	 */
	@Override
	public
		com.nbp.quary.application.form.service.model.QuarryMaterialInformation
			createQuarryMaterialInformation(long materialInfoId) {

		return _quarryMaterialInformationLocalService.
			createQuarryMaterialInformation(materialInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _quarryMaterialInformationLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the quarry material information with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryMaterialInformationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param materialInfoId the primary key of the quarry material information
	 * @return the quarry material information that was removed
	 * @throws PortalException if a quarry material information with the primary key could not be found
	 */
	@Override
	public
		com.nbp.quary.application.form.service.model.QuarryMaterialInformation
				deleteQuarryMaterialInformation(long materialInfoId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _quarryMaterialInformationLocalService.
			deleteQuarryMaterialInformation(materialInfoId);
	}

	/**
	 * Deletes the quarry material information from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryMaterialInformationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryMaterialInformation the quarry material information
	 * @return the quarry material information that was removed
	 */
	@Override
	public
		com.nbp.quary.application.form.service.model.QuarryMaterialInformation
			deleteQuarryMaterialInformation(
				com.nbp.quary.application.form.service.model.
					QuarryMaterialInformation quarryMaterialInformation) {

		return _quarryMaterialInformationLocalService.
			deleteQuarryMaterialInformation(quarryMaterialInformation);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _quarryMaterialInformationLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _quarryMaterialInformationLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _quarryMaterialInformationLocalService.dynamicQuery();
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

		return _quarryMaterialInformationLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.quary.application.form.service.model.impl.QuarryMaterialInformationModelImpl</code>.
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

		return _quarryMaterialInformationLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.quary.application.form.service.model.impl.QuarryMaterialInformationModelImpl</code>.
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

		return _quarryMaterialInformationLocalService.dynamicQuery(
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

		return _quarryMaterialInformationLocalService.dynamicQueryCount(
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

		return _quarryMaterialInformationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.quary.application.form.service.model.QuarryMaterialInformation
			fetchQuarryMaterialInformation(long materialInfoId) {

		return _quarryMaterialInformationLocalService.
			fetchQuarryMaterialInformation(materialInfoId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _quarryMaterialInformationLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _quarryMaterialInformationLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _quarryMaterialInformationLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _quarryMaterialInformationLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Returns the quarry material information with the primary key.
	 *
	 * @param materialInfoId the primary key of the quarry material information
	 * @return the quarry material information
	 * @throws PortalException if a quarry material information with the primary key could not be found
	 */
	@Override
	public
		com.nbp.quary.application.form.service.model.QuarryMaterialInformation
				getQuarryMaterialInformation(long materialInfoId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _quarryMaterialInformationLocalService.
			getQuarryMaterialInformation(materialInfoId);
	}

	@Override
	public
		com.nbp.quary.application.form.service.model.QuarryMaterialInformation
				getQuarryMaterialInformationBy_Id(long quarryApplicationId)
			throws com.nbp.quary.application.form.service.exception.
				NoSuchQuarryMaterialInformationException {

		return _quarryMaterialInformationLocalService.
			getQuarryMaterialInformationBy_Id(quarryApplicationId);
	}

	/**
	 * Returns a range of all the quarry material informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.quary.application.form.service.model.impl.QuarryMaterialInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry material informations
	 * @param end the upper bound of the range of quarry material informations (not inclusive)
	 * @return the range of quarry material informations
	 */
	@Override
	public java.util.List
		<com.nbp.quary.application.form.service.model.QuarryMaterialInformation>
			getQuarryMaterialInformations(int start, int end) {

		return _quarryMaterialInformationLocalService.
			getQuarryMaterialInformations(start, end);
	}

	/**
	 * Returns the number of quarry material informations.
	 *
	 * @return the number of quarry material informations
	 */
	@Override
	public int getQuarryMaterialInformationsCount() {
		return _quarryMaterialInformationLocalService.
			getQuarryMaterialInformationsCount();
	}

	/**
	 * Updates the quarry material information in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryMaterialInformationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryMaterialInformation the quarry material information
	 * @return the quarry material information that was updated
	 */
	@Override
	public
		com.nbp.quary.application.form.service.model.QuarryMaterialInformation
			updateQuarryMaterialInformation(
				com.nbp.quary.application.form.service.model.
					QuarryMaterialInformation quarryMaterialInformation) {

		return _quarryMaterialInformationLocalService.
			updateQuarryMaterialInformation(quarryMaterialInformation);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _quarryMaterialInformationLocalService.getBasePersistence();
	}

	@Override
	public QuarryMaterialInformationLocalService getWrappedService() {
		return _quarryMaterialInformationLocalService;
	}

	@Override
	public void setWrappedService(
		QuarryMaterialInformationLocalService
			quarryMaterialInformationLocalService) {

		_quarryMaterialInformationLocalService =
			quarryMaterialInformationLocalService;
	}

	private QuarryMaterialInformationLocalService
		_quarryMaterialInformationLocalService;

}