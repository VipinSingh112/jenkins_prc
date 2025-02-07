/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link PharmaDrugInfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see PharmaDrugInfoLocalService
 * @generated
 */
public class PharmaDrugInfoLocalServiceWrapper
	implements PharmaDrugInfoLocalService,
			   ServiceWrapper<PharmaDrugInfoLocalService> {

	public PharmaDrugInfoLocalServiceWrapper() {
		this(null);
	}

	public PharmaDrugInfoLocalServiceWrapper(
		PharmaDrugInfoLocalService pharmaDrugInfoLocalService) {

		_pharmaDrugInfoLocalService = pharmaDrugInfoLocalService;
	}

	/**
	 * Adds the pharma drug info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PharmaDrugInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pharmaDrugInfo the pharma drug info
	 * @return the pharma drug info that was added
	 */
	@Override
	public com.nbp.pharmaceutical.application.form.service.model.PharmaDrugInfo
		addPharmaDrugInfo(
			com.nbp.pharmaceutical.application.form.service.model.PharmaDrugInfo
				pharmaDrugInfo) {

		return _pharmaDrugInfoLocalService.addPharmaDrugInfo(pharmaDrugInfo);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pharmaDrugInfoLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new pharma drug info with the primary key. Does not add the pharma drug info to the database.
	 *
	 * @param pharmaDrugInfoId the primary key for the new pharma drug info
	 * @return the new pharma drug info
	 */
	@Override
	public com.nbp.pharmaceutical.application.form.service.model.PharmaDrugInfo
		createPharmaDrugInfo(long pharmaDrugInfoId) {

		return _pharmaDrugInfoLocalService.createPharmaDrugInfo(
			pharmaDrugInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pharmaDrugInfoLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the pharma drug info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PharmaDrugInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pharmaDrugInfoId the primary key of the pharma drug info
	 * @return the pharma drug info that was removed
	 * @throws PortalException if a pharma drug info with the primary key could not be found
	 */
	@Override
	public com.nbp.pharmaceutical.application.form.service.model.PharmaDrugInfo
			deletePharmaDrugInfo(long pharmaDrugInfoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pharmaDrugInfoLocalService.deletePharmaDrugInfo(
			pharmaDrugInfoId);
	}

	/**
	 * Deletes the pharma drug info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PharmaDrugInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pharmaDrugInfo the pharma drug info
	 * @return the pharma drug info that was removed
	 */
	@Override
	public com.nbp.pharmaceutical.application.form.service.model.PharmaDrugInfo
		deletePharmaDrugInfo(
			com.nbp.pharmaceutical.application.form.service.model.PharmaDrugInfo
				pharmaDrugInfo) {

		return _pharmaDrugInfoLocalService.deletePharmaDrugInfo(pharmaDrugInfo);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _pharmaDrugInfoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _pharmaDrugInfoLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _pharmaDrugInfoLocalService.dynamicQuery();
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

		return _pharmaDrugInfoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.pharmaceutical.application.form.service.model.impl.PharmaDrugInfoModelImpl</code>.
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

		return _pharmaDrugInfoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.pharmaceutical.application.form.service.model.impl.PharmaDrugInfoModelImpl</code>.
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

		return _pharmaDrugInfoLocalService.dynamicQuery(
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

		return _pharmaDrugInfoLocalService.dynamicQueryCount(dynamicQuery);
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

		return _pharmaDrugInfoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.pharmaceutical.application.form.service.model.PharmaDrugInfo
		fetchPharmaDrugInfo(long pharmaDrugInfoId) {

		return _pharmaDrugInfoLocalService.fetchPharmaDrugInfo(
			pharmaDrugInfoId);
	}

	@Override
	public com.nbp.pharmaceutical.application.form.service.model.PharmaDrugInfo
			findBygetPharmaByAppId(long pharmaApplicationId)
		throws com.nbp.pharmaceutical.application.form.service.exception.
			NoSuchPharmaDrugInfoException {

		return _pharmaDrugInfoLocalService.findBygetPharmaByAppId(
			pharmaApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _pharmaDrugInfoLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _pharmaDrugInfoLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _pharmaDrugInfoLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public java.util.List
		<com.nbp.pharmaceutical.application.form.service.model.PharmaDrugInfo>
			getPA_DI_PAI(long applicationId) {

		return _pharmaDrugInfoLocalService.getPA_DI_PAI(applicationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pharmaDrugInfoLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the pharma drug info with the primary key.
	 *
	 * @param pharmaDrugInfoId the primary key of the pharma drug info
	 * @return the pharma drug info
	 * @throws PortalException if a pharma drug info with the primary key could not be found
	 */
	@Override
	public com.nbp.pharmaceutical.application.form.service.model.PharmaDrugInfo
			getPharmaDrugInfo(long pharmaDrugInfoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pharmaDrugInfoLocalService.getPharmaDrugInfo(pharmaDrugInfoId);
	}

	/**
	 * Returns a range of all the pharma drug infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.pharmaceutical.application.form.service.model.impl.PharmaDrugInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma drug infos
	 * @param end the upper bound of the range of pharma drug infos (not inclusive)
	 * @return the range of pharma drug infos
	 */
	@Override
	public java.util.List
		<com.nbp.pharmaceutical.application.form.service.model.PharmaDrugInfo>
			getPharmaDrugInfos(int start, int end) {

		return _pharmaDrugInfoLocalService.getPharmaDrugInfos(start, end);
	}

	/**
	 * Returns the number of pharma drug infos.
	 *
	 * @return the number of pharma drug infos
	 */
	@Override
	public int getPharmaDrugInfosCount() {
		return _pharmaDrugInfoLocalService.getPharmaDrugInfosCount();
	}

	/**
	 * Updates the pharma drug info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PharmaDrugInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pharmaDrugInfo the pharma drug info
	 * @return the pharma drug info that was updated
	 */
	@Override
	public com.nbp.pharmaceutical.application.form.service.model.PharmaDrugInfo
		updatePharmaDrugInfo(
			com.nbp.pharmaceutical.application.form.service.model.PharmaDrugInfo
				pharmaDrugInfo) {

		return _pharmaDrugInfoLocalService.updatePharmaDrugInfo(pharmaDrugInfo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _pharmaDrugInfoLocalService.getBasePersistence();
	}

	@Override
	public PharmaDrugInfoLocalService getWrappedService() {
		return _pharmaDrugInfoLocalService;
	}

	@Override
	public void setWrappedService(
		PharmaDrugInfoLocalService pharmaDrugInfoLocalService) {

		_pharmaDrugInfoLocalService = pharmaDrugInfoLocalService;
	}

	private PharmaDrugInfoLocalService _pharmaDrugInfoLocalService;

}