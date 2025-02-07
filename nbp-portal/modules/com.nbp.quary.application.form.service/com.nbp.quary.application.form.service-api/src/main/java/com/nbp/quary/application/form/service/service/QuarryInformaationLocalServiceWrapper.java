/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quary.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link QuarryInformaationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see QuarryInformaationLocalService
 * @generated
 */
public class QuarryInformaationLocalServiceWrapper
	implements QuarryInformaationLocalService,
			   ServiceWrapper<QuarryInformaationLocalService> {

	public QuarryInformaationLocalServiceWrapper() {
		this(null);
	}

	public QuarryInformaationLocalServiceWrapper(
		QuarryInformaationLocalService quarryInformaationLocalService) {

		_quarryInformaationLocalService = quarryInformaationLocalService;
	}

	/**
	 * Adds the quarry informaation to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryInformaationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryInformaation the quarry informaation
	 * @return the quarry informaation that was added
	 */
	@Override
	public com.nbp.quary.application.form.service.model.QuarryInformaation
		addQuarryInformaation(
			com.nbp.quary.application.form.service.model.QuarryInformaation
				quarryInformaation) {

		return _quarryInformaationLocalService.addQuarryInformaation(
			quarryInformaation);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _quarryInformaationLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new quarry informaation with the primary key. Does not add the quarry informaation to the database.
	 *
	 * @param auarryInfoId the primary key for the new quarry informaation
	 * @return the new quarry informaation
	 */
	@Override
	public com.nbp.quary.application.form.service.model.QuarryInformaation
		createQuarryInformaation(long auarryInfoId) {

		return _quarryInformaationLocalService.createQuarryInformaation(
			auarryInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _quarryInformaationLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the quarry informaation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryInformaationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param auarryInfoId the primary key of the quarry informaation
	 * @return the quarry informaation that was removed
	 * @throws PortalException if a quarry informaation with the primary key could not be found
	 */
	@Override
	public com.nbp.quary.application.form.service.model.QuarryInformaation
			deleteQuarryInformaation(long auarryInfoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _quarryInformaationLocalService.deleteQuarryInformaation(
			auarryInfoId);
	}

	/**
	 * Deletes the quarry informaation from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryInformaationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryInformaation the quarry informaation
	 * @return the quarry informaation that was removed
	 */
	@Override
	public com.nbp.quary.application.form.service.model.QuarryInformaation
		deleteQuarryInformaation(
			com.nbp.quary.application.form.service.model.QuarryInformaation
				quarryInformaation) {

		return _quarryInformaationLocalService.deleteQuarryInformaation(
			quarryInformaation);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _quarryInformaationLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _quarryInformaationLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _quarryInformaationLocalService.dynamicQuery();
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

		return _quarryInformaationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.quary.application.form.service.model.impl.QuarryInformaationModelImpl</code>.
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

		return _quarryInformaationLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.quary.application.form.service.model.impl.QuarryInformaationModelImpl</code>.
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

		return _quarryInformaationLocalService.dynamicQuery(
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

		return _quarryInformaationLocalService.dynamicQueryCount(dynamicQuery);
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

		return _quarryInformaationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.quary.application.form.service.model.QuarryInformaation
		fetchQuarryInformaation(long auarryInfoId) {

		return _quarryInformaationLocalService.fetchQuarryInformaation(
			auarryInfoId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _quarryInformaationLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _quarryInformaationLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _quarryInformaationLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _quarryInformaationLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the quarry informaation with the primary key.
	 *
	 * @param auarryInfoId the primary key of the quarry informaation
	 * @return the quarry informaation
	 * @throws PortalException if a quarry informaation with the primary key could not be found
	 */
	@Override
	public com.nbp.quary.application.form.service.model.QuarryInformaation
			getQuarryInformaation(long auarryInfoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _quarryInformaationLocalService.getQuarryInformaation(
			auarryInfoId);
	}

	@Override
	public com.nbp.quary.application.form.service.model.QuarryInformaation
			getQuarryInformaationBy_Id(long quarryAppId)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryInformaationException {

		return _quarryInformaationLocalService.getQuarryInformaationBy_Id(
			quarryAppId);
	}

	/**
	 * Returns a range of all the quarry informaations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.quary.application.form.service.model.impl.QuarryInformaationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry informaations
	 * @param end the upper bound of the range of quarry informaations (not inclusive)
	 * @return the range of quarry informaations
	 */
	@Override
	public java.util.List
		<com.nbp.quary.application.form.service.model.QuarryInformaation>
			getQuarryInformaations(int start, int end) {

		return _quarryInformaationLocalService.getQuarryInformaations(
			start, end);
	}

	/**
	 * Returns the number of quarry informaations.
	 *
	 * @return the number of quarry informaations
	 */
	@Override
	public int getQuarryInformaationsCount() {
		return _quarryInformaationLocalService.getQuarryInformaationsCount();
	}

	/**
	 * Updates the quarry informaation in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryInformaationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryInformaation the quarry informaation
	 * @return the quarry informaation that was updated
	 */
	@Override
	public com.nbp.quary.application.form.service.model.QuarryInformaation
		updateQuarryInformaation(
			com.nbp.quary.application.form.service.model.QuarryInformaation
				quarryInformaation) {

		return _quarryInformaationLocalService.updateQuarryInformaation(
			quarryInformaation);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _quarryInformaationLocalService.getBasePersistence();
	}

	@Override
	public QuarryInformaationLocalService getWrappedService() {
		return _quarryInformaationLocalService;
	}

	@Override
	public void setWrappedService(
		QuarryInformaationLocalService quarryInformaationLocalService) {

		_quarryInformaationLocalService = quarryInformaationLocalService;
	}

	private QuarryInformaationLocalService _quarryInformaationLocalService;

}