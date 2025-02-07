/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quary.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link QuarryApplicatntInformationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see QuarryApplicatntInformationLocalService
 * @generated
 */
public class QuarryApplicatntInformationLocalServiceWrapper
	implements QuarryApplicatntInformationLocalService,
			   ServiceWrapper<QuarryApplicatntInformationLocalService> {

	public QuarryApplicatntInformationLocalServiceWrapper() {
		this(null);
	}

	public QuarryApplicatntInformationLocalServiceWrapper(
		QuarryApplicatntInformationLocalService
			quarryApplicatntInformationLocalService) {

		_quarryApplicatntInformationLocalService =
			quarryApplicatntInformationLocalService;
	}

	/**
	 * Adds the quarry applicatnt information to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryApplicatntInformationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryApplicatntInformation the quarry applicatnt information
	 * @return the quarry applicatnt information that was added
	 */
	@Override
	public
		com.nbp.quary.application.form.service.model.QuarryApplicatntInformation
			addQuarryApplicatntInformation(
				com.nbp.quary.application.form.service.model.
					QuarryApplicatntInformation quarryApplicatntInformation) {

		return _quarryApplicatntInformationLocalService.
			addQuarryApplicatntInformation(quarryApplicatntInformation);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _quarryApplicatntInformationLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new quarry applicatnt information with the primary key. Does not add the quarry applicatnt information to the database.
	 *
	 * @param auarryApplicantId the primary key for the new quarry applicatnt information
	 * @return the new quarry applicatnt information
	 */
	@Override
	public
		com.nbp.quary.application.form.service.model.QuarryApplicatntInformation
			createQuarryApplicatntInformation(long auarryApplicantId) {

		return _quarryApplicatntInformationLocalService.
			createQuarryApplicatntInformation(auarryApplicantId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _quarryApplicatntInformationLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the quarry applicatnt information with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryApplicatntInformationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param auarryApplicantId the primary key of the quarry applicatnt information
	 * @return the quarry applicatnt information that was removed
	 * @throws PortalException if a quarry applicatnt information with the primary key could not be found
	 */
	@Override
	public
		com.nbp.quary.application.form.service.model.QuarryApplicatntInformation
				deleteQuarryApplicatntInformation(long auarryApplicantId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _quarryApplicatntInformationLocalService.
			deleteQuarryApplicatntInformation(auarryApplicantId);
	}

	/**
	 * Deletes the quarry applicatnt information from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryApplicatntInformationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryApplicatntInformation the quarry applicatnt information
	 * @return the quarry applicatnt information that was removed
	 */
	@Override
	public
		com.nbp.quary.application.form.service.model.QuarryApplicatntInformation
			deleteQuarryApplicatntInformation(
				com.nbp.quary.application.form.service.model.
					QuarryApplicatntInformation quarryApplicatntInformation) {

		return _quarryApplicatntInformationLocalService.
			deleteQuarryApplicatntInformation(quarryApplicatntInformation);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _quarryApplicatntInformationLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _quarryApplicatntInformationLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _quarryApplicatntInformationLocalService.dynamicQuery();
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

		return _quarryApplicatntInformationLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.quary.application.form.service.model.impl.QuarryApplicatntInformationModelImpl</code>.
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

		return _quarryApplicatntInformationLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.quary.application.form.service.model.impl.QuarryApplicatntInformationModelImpl</code>.
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

		return _quarryApplicatntInformationLocalService.dynamicQuery(
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

		return _quarryApplicatntInformationLocalService.dynamicQueryCount(
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

		return _quarryApplicatntInformationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.quary.application.form.service.model.QuarryApplicatntInformation
			fetchQuarryApplicatntInformation(long auarryApplicantId) {

		return _quarryApplicatntInformationLocalService.
			fetchQuarryApplicatntInformation(auarryApplicantId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _quarryApplicatntInformationLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _quarryApplicatntInformationLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _quarryApplicatntInformationLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _quarryApplicatntInformationLocalService.getPersistedModel(
			primaryKeyObj);
	}

	@Override
	public
		com.nbp.quary.application.form.service.model.QuarryApplicatntInformation
				getQuarryApplicantBy_Id(long quarryAppId)
			throws com.nbp.quary.application.form.service.exception.
				NoSuchQuarryApplicatntInformationException {

		return _quarryApplicatntInformationLocalService.getQuarryApplicantBy_Id(
			quarryAppId);
	}

	/**
	 * Returns the quarry applicatnt information with the primary key.
	 *
	 * @param auarryApplicantId the primary key of the quarry applicatnt information
	 * @return the quarry applicatnt information
	 * @throws PortalException if a quarry applicatnt information with the primary key could not be found
	 */
	@Override
	public
		com.nbp.quary.application.form.service.model.QuarryApplicatntInformation
				getQuarryApplicatntInformation(long auarryApplicantId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _quarryApplicatntInformationLocalService.
			getQuarryApplicatntInformation(auarryApplicantId);
	}

	/**
	 * Returns a range of all the quarry applicatnt informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.quary.application.form.service.model.impl.QuarryApplicatntInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry applicatnt informations
	 * @param end the upper bound of the range of quarry applicatnt informations (not inclusive)
	 * @return the range of quarry applicatnt informations
	 */
	@Override
	public java.util.List
		<com.nbp.quary.application.form.service.model.
			QuarryApplicatntInformation> getQuarryApplicatntInformations(
				int start, int end) {

		return _quarryApplicatntInformationLocalService.
			getQuarryApplicatntInformations(start, end);
	}

	/**
	 * Returns the number of quarry applicatnt informations.
	 *
	 * @return the number of quarry applicatnt informations
	 */
	@Override
	public int getQuarryApplicatntInformationsCount() {
		return _quarryApplicatntInformationLocalService.
			getQuarryApplicatntInformationsCount();
	}

	/**
	 * Updates the quarry applicatnt information in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryApplicatntInformationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryApplicatntInformation the quarry applicatnt information
	 * @return the quarry applicatnt information that was updated
	 */
	@Override
	public
		com.nbp.quary.application.form.service.model.QuarryApplicatntInformation
			updateQuarryApplicatntInformation(
				com.nbp.quary.application.form.service.model.
					QuarryApplicatntInformation quarryApplicatntInformation) {

		return _quarryApplicatntInformationLocalService.
			updateQuarryApplicatntInformation(quarryApplicatntInformation);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _quarryApplicatntInformationLocalService.getBasePersistence();
	}

	@Override
	public QuarryApplicatntInformationLocalService getWrappedService() {
		return _quarryApplicatntInformationLocalService;
	}

	@Override
	public void setWrappedService(
		QuarryApplicatntInformationLocalService
			quarryApplicatntInformationLocalService) {

		_quarryApplicatntInformationLocalService =
			quarryApplicatntInformationLocalService;
	}

	private QuarryApplicatntInformationLocalService
		_quarryApplicatntInformationLocalService;

}