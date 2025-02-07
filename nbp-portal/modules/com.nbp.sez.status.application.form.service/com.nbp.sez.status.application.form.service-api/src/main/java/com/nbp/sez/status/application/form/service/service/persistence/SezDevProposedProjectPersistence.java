/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.sez.status.application.form.service.exception.NoSuchSezDevProposedProjectException;
import com.nbp.sez.status.application.form.service.model.SezDevProposedProject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the sez dev proposed project service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezDevProposedProjectUtil
 * @generated
 */
@ProviderType
public interface SezDevProposedProjectPersistence
	extends BasePersistence<SezDevProposedProject> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SezDevProposedProjectUtil} to access the sez dev proposed project persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the sez dev proposed project where sezStatusApplicationId = &#63; or throws a <code>NoSuchSezDevProposedProjectException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez dev proposed project
	 * @throws NoSuchSezDevProposedProjectException if a matching sez dev proposed project could not be found
	 */
	public SezDevProposedProject findBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezDevProposedProjectException;

	/**
	 * Returns the sez dev proposed project where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez dev proposed project, or <code>null</code> if a matching sez dev proposed project could not be found
	 */
	public SezDevProposedProject fetchBygetSezStatusByAppId(
		long sezStatusApplicationId);

	/**
	 * Returns the sez dev proposed project where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez dev proposed project, or <code>null</code> if a matching sez dev proposed project could not be found
	 */
	public SezDevProposedProject fetchBygetSezStatusByAppId(
		long sezStatusApplicationId, boolean useFinderCache);

	/**
	 * Removes the sez dev proposed project where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez dev proposed project that was removed
	 */
	public SezDevProposedProject removeBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezDevProposedProjectException;

	/**
	 * Returns the number of sez dev proposed projects where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez dev proposed projects
	 */
	public int countBygetSezStatusByAppId(long sezStatusApplicationId);

	/**
	 * Caches the sez dev proposed project in the entity cache if it is enabled.
	 *
	 * @param sezDevProposedProject the sez dev proposed project
	 */
	public void cacheResult(SezDevProposedProject sezDevProposedProject);

	/**
	 * Caches the sez dev proposed projects in the entity cache if it is enabled.
	 *
	 * @param sezDevProposedProjects the sez dev proposed projects
	 */
	public void cacheResult(
		java.util.List<SezDevProposedProject> sezDevProposedProjects);

	/**
	 * Creates a new sez dev proposed project with the primary key. Does not add the sez dev proposed project to the database.
	 *
	 * @param sezDevProposedProjectId the primary key for the new sez dev proposed project
	 * @return the new sez dev proposed project
	 */
	public SezDevProposedProject create(long sezDevProposedProjectId);

	/**
	 * Removes the sez dev proposed project with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezDevProposedProjectId the primary key of the sez dev proposed project
	 * @return the sez dev proposed project that was removed
	 * @throws NoSuchSezDevProposedProjectException if a sez dev proposed project with the primary key could not be found
	 */
	public SezDevProposedProject remove(long sezDevProposedProjectId)
		throws NoSuchSezDevProposedProjectException;

	public SezDevProposedProject updateImpl(
		SezDevProposedProject sezDevProposedProject);

	/**
	 * Returns the sez dev proposed project with the primary key or throws a <code>NoSuchSezDevProposedProjectException</code> if it could not be found.
	 *
	 * @param sezDevProposedProjectId the primary key of the sez dev proposed project
	 * @return the sez dev proposed project
	 * @throws NoSuchSezDevProposedProjectException if a sez dev proposed project with the primary key could not be found
	 */
	public SezDevProposedProject findByPrimaryKey(long sezDevProposedProjectId)
		throws NoSuchSezDevProposedProjectException;

	/**
	 * Returns the sez dev proposed project with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezDevProposedProjectId the primary key of the sez dev proposed project
	 * @return the sez dev proposed project, or <code>null</code> if a sez dev proposed project with the primary key could not be found
	 */
	public SezDevProposedProject fetchByPrimaryKey(
		long sezDevProposedProjectId);

	/**
	 * Returns all the sez dev proposed projects.
	 *
	 * @return the sez dev proposed projects
	 */
	public java.util.List<SezDevProposedProject> findAll();

	/**
	 * Returns a range of all the sez dev proposed projects.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevProposedProjectModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev proposed projects
	 * @param end the upper bound of the range of sez dev proposed projects (not inclusive)
	 * @return the range of sez dev proposed projects
	 */
	public java.util.List<SezDevProposedProject> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the sez dev proposed projects.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevProposedProjectModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev proposed projects
	 * @param end the upper bound of the range of sez dev proposed projects (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez dev proposed projects
	 */
	public java.util.List<SezDevProposedProject> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SezDevProposedProject>
			orderByComparator);

	/**
	 * Returns an ordered range of all the sez dev proposed projects.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevProposedProjectModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev proposed projects
	 * @param end the upper bound of the range of sez dev proposed projects (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez dev proposed projects
	 */
	public java.util.List<SezDevProposedProject> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SezDevProposedProject>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the sez dev proposed projects from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of sez dev proposed projects.
	 *
	 * @return the number of sez dev proposed projects
	 */
	public int countAll();

}