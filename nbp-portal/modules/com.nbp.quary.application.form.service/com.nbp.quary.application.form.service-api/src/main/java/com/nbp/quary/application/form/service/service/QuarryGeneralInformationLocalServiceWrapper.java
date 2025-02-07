/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quary.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link QuarryGeneralInformationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see QuarryGeneralInformationLocalService
 * @generated
 */
public class QuarryGeneralInformationLocalServiceWrapper
	implements QuarryGeneralInformationLocalService,
			   ServiceWrapper<QuarryGeneralInformationLocalService> {

	public QuarryGeneralInformationLocalServiceWrapper() {
		this(null);
	}

	public QuarryGeneralInformationLocalServiceWrapper(
		QuarryGeneralInformationLocalService
			quarryGeneralInformationLocalService) {

		_quarryGeneralInformationLocalService =
			quarryGeneralInformationLocalService;
	}

	/**
	 * Adds the quarry general information to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryGeneralInformationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryGeneralInformation the quarry general information
	 * @return the quarry general information that was added
	 */
	@Override
	public com.nbp.quary.application.form.service.model.QuarryGeneralInformation
		addQuarryGeneralInformation(
			com.nbp.quary.application.form.service.model.
				QuarryGeneralInformation quarryGeneralInformation) {

		return _quarryGeneralInformationLocalService.
			addQuarryGeneralInformation(quarryGeneralInformation);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _quarryGeneralInformationLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new quarry general information with the primary key. Does not add the quarry general information to the database.
	 *
	 * @param generalInfoId the primary key for the new quarry general information
	 * @return the new quarry general information
	 */
	@Override
	public com.nbp.quary.application.form.service.model.QuarryGeneralInformation
		createQuarryGeneralInformation(long generalInfoId) {

		return _quarryGeneralInformationLocalService.
			createQuarryGeneralInformation(generalInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _quarryGeneralInformationLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the quarry general information with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryGeneralInformationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param generalInfoId the primary key of the quarry general information
	 * @return the quarry general information that was removed
	 * @throws PortalException if a quarry general information with the primary key could not be found
	 */
	@Override
	public com.nbp.quary.application.form.service.model.QuarryGeneralInformation
			deleteQuarryGeneralInformation(long generalInfoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _quarryGeneralInformationLocalService.
			deleteQuarryGeneralInformation(generalInfoId);
	}

	/**
	 * Deletes the quarry general information from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryGeneralInformationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryGeneralInformation the quarry general information
	 * @return the quarry general information that was removed
	 */
	@Override
	public com.nbp.quary.application.form.service.model.QuarryGeneralInformation
		deleteQuarryGeneralInformation(
			com.nbp.quary.application.form.service.model.
				QuarryGeneralInformation quarryGeneralInformation) {

		return _quarryGeneralInformationLocalService.
			deleteQuarryGeneralInformation(quarryGeneralInformation);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _quarryGeneralInformationLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _quarryGeneralInformationLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _quarryGeneralInformationLocalService.dynamicQuery();
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

		return _quarryGeneralInformationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.quary.application.form.service.model.impl.QuarryGeneralInformationModelImpl</code>.
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

		return _quarryGeneralInformationLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.quary.application.form.service.model.impl.QuarryGeneralInformationModelImpl</code>.
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

		return _quarryGeneralInformationLocalService.dynamicQuery(
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

		return _quarryGeneralInformationLocalService.dynamicQueryCount(
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

		return _quarryGeneralInformationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.quary.application.form.service.model.QuarryGeneralInformation
		fetchQuarryGeneralInformation(long generalInfoId) {

		return _quarryGeneralInformationLocalService.
			fetchQuarryGeneralInformation(generalInfoId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _quarryGeneralInformationLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _quarryGeneralInformationLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _quarryGeneralInformationLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _quarryGeneralInformationLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Returns the quarry general information with the primary key.
	 *
	 * @param generalInfoId the primary key of the quarry general information
	 * @return the quarry general information
	 * @throws PortalException if a quarry general information with the primary key could not be found
	 */
	@Override
	public com.nbp.quary.application.form.service.model.QuarryGeneralInformation
			getQuarryGeneralInformation(long generalInfoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _quarryGeneralInformationLocalService.
			getQuarryGeneralInformation(generalInfoId);
	}

	@Override
	public com.nbp.quary.application.form.service.model.QuarryGeneralInformation
			getQuarryGeneralInformationBy_Id(long quarryAppId)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryGeneralInformationException {

		return _quarryGeneralInformationLocalService.
			getQuarryGeneralInformationBy_Id(quarryAppId);
	}

	/**
	 * Returns a range of all the quarry general informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.quary.application.form.service.model.impl.QuarryGeneralInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry general informations
	 * @param end the upper bound of the range of quarry general informations (not inclusive)
	 * @return the range of quarry general informations
	 */
	@Override
	public java.util.List
		<com.nbp.quary.application.form.service.model.QuarryGeneralInformation>
			getQuarryGeneralInformations(int start, int end) {

		return _quarryGeneralInformationLocalService.
			getQuarryGeneralInformations(start, end);
	}

	/**
	 * Returns the number of quarry general informations.
	 *
	 * @return the number of quarry general informations
	 */
	@Override
	public int getQuarryGeneralInformationsCount() {
		return _quarryGeneralInformationLocalService.
			getQuarryGeneralInformationsCount();
	}

	/**
	 * Updates the quarry general information in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryGeneralInformationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryGeneralInformation the quarry general information
	 * @return the quarry general information that was updated
	 */
	@Override
	public com.nbp.quary.application.form.service.model.QuarryGeneralInformation
		updateQuarryGeneralInformation(
			com.nbp.quary.application.form.service.model.
				QuarryGeneralInformation quarryGeneralInformation) {

		return _quarryGeneralInformationLocalService.
			updateQuarryGeneralInformation(quarryGeneralInformation);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _quarryGeneralInformationLocalService.getBasePersistence();
	}

	@Override
	public QuarryGeneralInformationLocalService getWrappedService() {
		return _quarryGeneralInformationLocalService;
	}

	@Override
	public void setWrappedService(
		QuarryGeneralInformationLocalService
			quarryGeneralInformationLocalService) {

		_quarryGeneralInformationLocalService =
			quarryGeneralInformationLocalService;
	}

	private QuarryGeneralInformationLocalService
		_quarryGeneralInformationLocalService;

}