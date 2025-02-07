/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link FitPropDeclareApplicantLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see FitPropDeclareApplicantLocalService
 * @generated
 */
public class FitPropDeclareApplicantLocalServiceWrapper
	implements FitPropDeclareApplicantLocalService,
			   ServiceWrapper<FitPropDeclareApplicantLocalService> {

	public FitPropDeclareApplicantLocalServiceWrapper() {
		this(null);
	}

	public FitPropDeclareApplicantLocalServiceWrapper(
		FitPropDeclareApplicantLocalService
			fitPropDeclareApplicantLocalService) {

		_fitPropDeclareApplicantLocalService =
			fitPropDeclareApplicantLocalService;
	}

	/**
	 * Adds the fit prop declare applicant to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FitPropDeclareApplicantLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fitPropDeclareApplicant the fit prop declare applicant
	 * @return the fit prop declare applicant that was added
	 */
	@Override
	public com.nbp.hsra.application.service.model.FitPropDeclareApplicant
		addFitPropDeclareApplicant(
			com.nbp.hsra.application.service.model.FitPropDeclareApplicant
				fitPropDeclareApplicant) {

		return _fitPropDeclareApplicantLocalService.addFitPropDeclareApplicant(
			fitPropDeclareApplicant);
	}

	/**
	 * Creates a new fit prop declare applicant with the primary key. Does not add the fit prop declare applicant to the database.
	 *
	 * @param fitPropDeclareApplicantId the primary key for the new fit prop declare applicant
	 * @return the new fit prop declare applicant
	 */
	@Override
	public com.nbp.hsra.application.service.model.FitPropDeclareApplicant
		createFitPropDeclareApplicant(long fitPropDeclareApplicantId) {

		return _fitPropDeclareApplicantLocalService.
			createFitPropDeclareApplicant(fitPropDeclareApplicantId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fitPropDeclareApplicantLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the fit prop declare applicant from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FitPropDeclareApplicantLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fitPropDeclareApplicant the fit prop declare applicant
	 * @return the fit prop declare applicant that was removed
	 */
	@Override
	public com.nbp.hsra.application.service.model.FitPropDeclareApplicant
		deleteFitPropDeclareApplicant(
			com.nbp.hsra.application.service.model.FitPropDeclareApplicant
				fitPropDeclareApplicant) {

		return _fitPropDeclareApplicantLocalService.
			deleteFitPropDeclareApplicant(fitPropDeclareApplicant);
	}

	/**
	 * Deletes the fit prop declare applicant with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FitPropDeclareApplicantLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fitPropDeclareApplicantId the primary key of the fit prop declare applicant
	 * @return the fit prop declare applicant that was removed
	 * @throws PortalException if a fit prop declare applicant with the primary key could not be found
	 */
	@Override
	public com.nbp.hsra.application.service.model.FitPropDeclareApplicant
			deleteFitPropDeclareApplicant(long fitPropDeclareApplicantId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fitPropDeclareApplicantLocalService.
			deleteFitPropDeclareApplicant(fitPropDeclareApplicantId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fitPropDeclareApplicantLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _fitPropDeclareApplicantLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _fitPropDeclareApplicantLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _fitPropDeclareApplicantLocalService.dynamicQuery();
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

		return _fitPropDeclareApplicantLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.FitPropDeclareApplicantModelImpl</code>.
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

		return _fitPropDeclareApplicantLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.FitPropDeclareApplicantModelImpl</code>.
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

		return _fitPropDeclareApplicantLocalService.dynamicQuery(
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

		return _fitPropDeclareApplicantLocalService.dynamicQueryCount(
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

		return _fitPropDeclareApplicantLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.hsra.application.service.model.FitPropDeclareApplicant
		fetchFitPropDeclareApplicant(long fitPropDeclareApplicantId) {

		return _fitPropDeclareApplicantLocalService.
			fetchFitPropDeclareApplicant(fitPropDeclareApplicantId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _fitPropDeclareApplicantLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the fit prop declare applicant with the primary key.
	 *
	 * @param fitPropDeclareApplicantId the primary key of the fit prop declare applicant
	 * @return the fit prop declare applicant
	 * @throws PortalException if a fit prop declare applicant with the primary key could not be found
	 */
	@Override
	public com.nbp.hsra.application.service.model.FitPropDeclareApplicant
			getFitPropDeclareApplicant(long fitPropDeclareApplicantId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fitPropDeclareApplicantLocalService.getFitPropDeclareApplicant(
			fitPropDeclareApplicantId);
	}

	/**
	 * Returns a range of all the fit prop declare applicants.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.FitPropDeclareApplicantModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fit prop declare applicants
	 * @param end the upper bound of the range of fit prop declare applicants (not inclusive)
	 * @return the range of fit prop declare applicants
	 */
	@Override
	public java.util.List
		<com.nbp.hsra.application.service.model.FitPropDeclareApplicant>
			getFitPropDeclareApplicants(int start, int end) {

		return _fitPropDeclareApplicantLocalService.getFitPropDeclareApplicants(
			start, end);
	}

	/**
	 * Returns the number of fit prop declare applicants.
	 *
	 * @return the number of fit prop declare applicants
	 */
	@Override
	public int getFitPropDeclareApplicantsCount() {
		return _fitPropDeclareApplicantLocalService.
			getFitPropDeclareApplicantsCount();
	}

	@Override
	public com.nbp.hsra.application.service.model.FitPropDeclareApplicant
			getHsraById(long hsraApplicationId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchFitPropDeclareApplicantException {

		return _fitPropDeclareApplicantLocalService.getHsraById(
			hsraApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _fitPropDeclareApplicantLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _fitPropDeclareApplicantLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fitPropDeclareApplicantLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the fit prop declare applicant in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FitPropDeclareApplicantLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fitPropDeclareApplicant the fit prop declare applicant
	 * @return the fit prop declare applicant that was updated
	 */
	@Override
	public com.nbp.hsra.application.service.model.FitPropDeclareApplicant
		updateFitPropDeclareApplicant(
			com.nbp.hsra.application.service.model.FitPropDeclareApplicant
				fitPropDeclareApplicant) {

		return _fitPropDeclareApplicantLocalService.
			updateFitPropDeclareApplicant(fitPropDeclareApplicant);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _fitPropDeclareApplicantLocalService.getBasePersistence();
	}

	@Override
	public FitPropDeclareApplicantLocalService getWrappedService() {
		return _fitPropDeclareApplicantLocalService;
	}

	@Override
	public void setWrappedService(
		FitPropDeclareApplicantLocalService
			fitPropDeclareApplicantLocalService) {

		_fitPropDeclareApplicantLocalService =
			fitPropDeclareApplicantLocalService;
	}

	private FitPropDeclareApplicantLocalService
		_fitPropDeclareApplicantLocalService;

}