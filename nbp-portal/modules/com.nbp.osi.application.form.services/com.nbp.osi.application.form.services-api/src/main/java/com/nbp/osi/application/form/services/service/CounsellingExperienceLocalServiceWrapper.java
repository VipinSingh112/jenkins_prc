/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link CounsellingExperienceLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CounsellingExperienceLocalService
 * @generated
 */
public class CounsellingExperienceLocalServiceWrapper
	implements CounsellingExperienceLocalService,
			   ServiceWrapper<CounsellingExperienceLocalService> {

	public CounsellingExperienceLocalServiceWrapper() {
		this(null);
	}

	public CounsellingExperienceLocalServiceWrapper(
		CounsellingExperienceLocalService counsellingExperienceLocalService) {

		_counsellingExperienceLocalService = counsellingExperienceLocalService;
	}

	/**
	 * Adds the counselling experience to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CounsellingExperienceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param counsellingExperience the counselling experience
	 * @return the counselling experience that was added
	 */
	@Override
	public com.nbp.osi.application.form.services.model.CounsellingExperience
		addCounsellingExperience(
			com.nbp.osi.application.form.services.model.CounsellingExperience
				counsellingExperience) {

		return _counsellingExperienceLocalService.addCounsellingExperience(
			counsellingExperience);
	}

	/**
	 * Creates a new counselling experience with the primary key. Does not add the counselling experience to the database.
	 *
	 * @param counsellingExperienceId the primary key for the new counselling experience
	 * @return the new counselling experience
	 */
	@Override
	public com.nbp.osi.application.form.services.model.CounsellingExperience
		createCounsellingExperience(long counsellingExperienceId) {

		return _counsellingExperienceLocalService.createCounsellingExperience(
			counsellingExperienceId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _counsellingExperienceLocalService.createPersistedModel(
			primaryKeyObj);
	}

	@Override
	public void delete_OSI_CE_BY_Id(long osiApplicationId) {
		_counsellingExperienceLocalService.delete_OSI_CE_BY_Id(
			osiApplicationId);
	}

	/**
	 * Deletes the counselling experience from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CounsellingExperienceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param counsellingExperience the counselling experience
	 * @return the counselling experience that was removed
	 */
	@Override
	public com.nbp.osi.application.form.services.model.CounsellingExperience
		deleteCounsellingExperience(
			com.nbp.osi.application.form.services.model.CounsellingExperience
				counsellingExperience) {

		return _counsellingExperienceLocalService.deleteCounsellingExperience(
			counsellingExperience);
	}

	/**
	 * Deletes the counselling experience with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CounsellingExperienceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param counsellingExperienceId the primary key of the counselling experience
	 * @return the counselling experience that was removed
	 * @throws PortalException if a counselling experience with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.application.form.services.model.CounsellingExperience
			deleteCounsellingExperience(long counsellingExperienceId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _counsellingExperienceLocalService.deleteCounsellingExperience(
			counsellingExperienceId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _counsellingExperienceLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _counsellingExperienceLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _counsellingExperienceLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _counsellingExperienceLocalService.dynamicQuery();
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

		return _counsellingExperienceLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.application.form.services.model.impl.CounsellingExperienceModelImpl</code>.
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

		return _counsellingExperienceLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.application.form.services.model.impl.CounsellingExperienceModelImpl</code>.
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

		return _counsellingExperienceLocalService.dynamicQuery(
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

		return _counsellingExperienceLocalService.dynamicQueryCount(
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

		return _counsellingExperienceLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.osi.application.form.services.model.CounsellingExperience
		fetchCounsellingExperience(long counsellingExperienceId) {

		return _counsellingExperienceLocalService.fetchCounsellingExperience(
			counsellingExperienceId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _counsellingExperienceLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the counselling experience with the primary key.
	 *
	 * @param counsellingExperienceId the primary key of the counselling experience
	 * @return the counselling experience
	 * @throws PortalException if a counselling experience with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.application.form.services.model.CounsellingExperience
			getCounsellingExperience(long counsellingExperienceId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _counsellingExperienceLocalService.getCounsellingExperience(
			counsellingExperienceId);
	}

	/**
	 * Returns a range of all the counselling experiences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.application.form.services.model.impl.CounsellingExperienceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of counselling experiences
	 * @param end the upper bound of the range of counselling experiences (not inclusive)
	 * @return the range of counselling experiences
	 */
	@Override
	public java.util.List
		<com.nbp.osi.application.form.services.model.CounsellingExperience>
			getCounsellingExperiences(int start, int end) {

		return _counsellingExperienceLocalService.getCounsellingExperiences(
			start, end);
	}

	/**
	 * Returns the number of counselling experiences.
	 *
	 * @return the number of counselling experiences
	 */
	@Override
	public int getCounsellingExperiencesCount() {
		return _counsellingExperienceLocalService.
			getCounsellingExperiencesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _counsellingExperienceLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _counsellingExperienceLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public java.util.List
		<com.nbp.osi.application.form.services.model.CounsellingExperience>
			getosiById(long applicationId) {

		return _counsellingExperienceLocalService.getosiById(applicationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _counsellingExperienceLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the counselling experience in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CounsellingExperienceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param counsellingExperience the counselling experience
	 * @return the counselling experience that was updated
	 */
	@Override
	public com.nbp.osi.application.form.services.model.CounsellingExperience
		updateCounsellingExperience(
			com.nbp.osi.application.form.services.model.CounsellingExperience
				counsellingExperience) {

		return _counsellingExperienceLocalService.updateCounsellingExperience(
			counsellingExperience);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _counsellingExperienceLocalService.getBasePersistence();
	}

	@Override
	public CounsellingExperienceLocalService getWrappedService() {
		return _counsellingExperienceLocalService;
	}

	@Override
	public void setWrappedService(
		CounsellingExperienceLocalService counsellingExperienceLocalService) {

		_counsellingExperienceLocalService = counsellingExperienceLocalService;
	}

	private CounsellingExperienceLocalService
		_counsellingExperienceLocalService;

}