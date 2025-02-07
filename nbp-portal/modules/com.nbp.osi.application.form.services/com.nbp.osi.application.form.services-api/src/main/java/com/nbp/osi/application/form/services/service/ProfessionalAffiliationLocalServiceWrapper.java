/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link ProfessionalAffiliationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ProfessionalAffiliationLocalService
 * @generated
 */
public class ProfessionalAffiliationLocalServiceWrapper
	implements ProfessionalAffiliationLocalService,
			   ServiceWrapper<ProfessionalAffiliationLocalService> {

	public ProfessionalAffiliationLocalServiceWrapper() {
		this(null);
	}

	public ProfessionalAffiliationLocalServiceWrapper(
		ProfessionalAffiliationLocalService
			professionalAffiliationLocalService) {

		_professionalAffiliationLocalService =
			professionalAffiliationLocalService;
	}

	/**
	 * Adds the professional affiliation to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ProfessionalAffiliationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param professionalAffiliation the professional affiliation
	 * @return the professional affiliation that was added
	 */
	@Override
	public com.nbp.osi.application.form.services.model.ProfessionalAffiliation
		addProfessionalAffiliation(
			com.nbp.osi.application.form.services.model.ProfessionalAffiliation
				professionalAffiliation) {

		return _professionalAffiliationLocalService.addProfessionalAffiliation(
			professionalAffiliation);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _professionalAffiliationLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new professional affiliation with the primary key. Does not add the professional affiliation to the database.
	 *
	 * @param professionalAffiliationId the primary key for the new professional affiliation
	 * @return the new professional affiliation
	 */
	@Override
	public com.nbp.osi.application.form.services.model.ProfessionalAffiliation
		createProfessionalAffiliation(long professionalAffiliationId) {

		return _professionalAffiliationLocalService.
			createProfessionalAffiliation(professionalAffiliationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _professionalAffiliationLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the professional affiliation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ProfessionalAffiliationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param professionalAffiliationId the primary key of the professional affiliation
	 * @return the professional affiliation that was removed
	 * @throws PortalException if a professional affiliation with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.application.form.services.model.ProfessionalAffiliation
			deleteProfessionalAffiliation(long professionalAffiliationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _professionalAffiliationLocalService.
			deleteProfessionalAffiliation(professionalAffiliationId);
	}

	/**
	 * Deletes the professional affiliation from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ProfessionalAffiliationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param professionalAffiliation the professional affiliation
	 * @return the professional affiliation that was removed
	 */
	@Override
	public com.nbp.osi.application.form.services.model.ProfessionalAffiliation
		deleteProfessionalAffiliation(
			com.nbp.osi.application.form.services.model.ProfessionalAffiliation
				professionalAffiliation) {

		return _professionalAffiliationLocalService.
			deleteProfessionalAffiliation(professionalAffiliation);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _professionalAffiliationLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _professionalAffiliationLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _professionalAffiliationLocalService.dynamicQuery();
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

		return _professionalAffiliationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.application.form.services.model.impl.ProfessionalAffiliationModelImpl</code>.
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

		return _professionalAffiliationLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.application.form.services.model.impl.ProfessionalAffiliationModelImpl</code>.
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

		return _professionalAffiliationLocalService.dynamicQuery(
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

		return _professionalAffiliationLocalService.dynamicQueryCount(
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

		return _professionalAffiliationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.osi.application.form.services.model.ProfessionalAffiliation
		fetchProfessionalAffiliation(long professionalAffiliationId) {

		return _professionalAffiliationLocalService.
			fetchProfessionalAffiliation(professionalAffiliationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _professionalAffiliationLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _professionalAffiliationLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _professionalAffiliationLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.nbp.osi.application.form.services.model.ProfessionalAffiliation
			getOsiById(long applicationId)
		throws com.nbp.osi.application.form.services.exception.
			NoSuchProfessionalAffiliationException {

		return _professionalAffiliationLocalService.getOsiById(applicationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _professionalAffiliationLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Returns the professional affiliation with the primary key.
	 *
	 * @param professionalAffiliationId the primary key of the professional affiliation
	 * @return the professional affiliation
	 * @throws PortalException if a professional affiliation with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.application.form.services.model.ProfessionalAffiliation
			getProfessionalAffiliation(long professionalAffiliationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _professionalAffiliationLocalService.getProfessionalAffiliation(
			professionalAffiliationId);
	}

	/**
	 * Returns a range of all the professional affiliations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.application.form.services.model.impl.ProfessionalAffiliationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of professional affiliations
	 * @param end the upper bound of the range of professional affiliations (not inclusive)
	 * @return the range of professional affiliations
	 */
	@Override
	public java.util.List
		<com.nbp.osi.application.form.services.model.ProfessionalAffiliation>
			getProfessionalAffiliations(int start, int end) {

		return _professionalAffiliationLocalService.getProfessionalAffiliations(
			start, end);
	}

	/**
	 * Returns the number of professional affiliations.
	 *
	 * @return the number of professional affiliations
	 */
	@Override
	public int getProfessionalAffiliationsCount() {
		return _professionalAffiliationLocalService.
			getProfessionalAffiliationsCount();
	}

	/**
	 * Updates the professional affiliation in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ProfessionalAffiliationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param professionalAffiliation the professional affiliation
	 * @return the professional affiliation that was updated
	 */
	@Override
	public com.nbp.osi.application.form.services.model.ProfessionalAffiliation
		updateProfessionalAffiliation(
			com.nbp.osi.application.form.services.model.ProfessionalAffiliation
				professionalAffiliation) {

		return _professionalAffiliationLocalService.
			updateProfessionalAffiliation(professionalAffiliation);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _professionalAffiliationLocalService.getBasePersistence();
	}

	@Override
	public ProfessionalAffiliationLocalService getWrappedService() {
		return _professionalAffiliationLocalService;
	}

	@Override
	public void setWrappedService(
		ProfessionalAffiliationLocalService
			professionalAffiliationLocalService) {

		_professionalAffiliationLocalService =
			professionalAffiliationLocalService;
	}

	private ProfessionalAffiliationLocalService
		_professionalAffiliationLocalService;

}