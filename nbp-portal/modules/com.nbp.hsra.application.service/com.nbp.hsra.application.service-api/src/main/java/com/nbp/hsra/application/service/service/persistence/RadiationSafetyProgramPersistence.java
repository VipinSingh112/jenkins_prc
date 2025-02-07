/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.hsra.application.service.exception.NoSuchRadiationSafetyProgramException;
import com.nbp.hsra.application.service.model.RadiationSafetyProgram;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the radiation safety program service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RadiationSafetyProgramUtil
 * @generated
 */
@ProviderType
public interface RadiationSafetyProgramPersistence
	extends BasePersistence<RadiationSafetyProgram> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link RadiationSafetyProgramUtil} to access the radiation safety program persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the radiation safety program where hsraApplicationId = &#63; or throws a <code>NoSuchRadiationSafetyProgramException</code> if it could not be found.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching radiation safety program
	 * @throws NoSuchRadiationSafetyProgramException if a matching radiation safety program could not be found
	 */
	public RadiationSafetyProgram findBygetHsraById(long hsraApplicationId)
		throws NoSuchRadiationSafetyProgramException;

	/**
	 * Returns the radiation safety program where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching radiation safety program, or <code>null</code> if a matching radiation safety program could not be found
	 */
	public RadiationSafetyProgram fetchBygetHsraById(long hsraApplicationId);

	/**
	 * Returns the radiation safety program where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching radiation safety program, or <code>null</code> if a matching radiation safety program could not be found
	 */
	public RadiationSafetyProgram fetchBygetHsraById(
		long hsraApplicationId, boolean useFinderCache);

	/**
	 * Removes the radiation safety program where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the radiation safety program that was removed
	 */
	public RadiationSafetyProgram removeBygetHsraById(long hsraApplicationId)
		throws NoSuchRadiationSafetyProgramException;

	/**
	 * Returns the number of radiation safety programs where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching radiation safety programs
	 */
	public int countBygetHsraById(long hsraApplicationId);

	/**
	 * Caches the radiation safety program in the entity cache if it is enabled.
	 *
	 * @param radiationSafetyProgram the radiation safety program
	 */
	public void cacheResult(RadiationSafetyProgram radiationSafetyProgram);

	/**
	 * Caches the radiation safety programs in the entity cache if it is enabled.
	 *
	 * @param radiationSafetyPrograms the radiation safety programs
	 */
	public void cacheResult(
		java.util.List<RadiationSafetyProgram> radiationSafetyPrograms);

	/**
	 * Creates a new radiation safety program with the primary key. Does not add the radiation safety program to the database.
	 *
	 * @param radiationSafetyProgramId the primary key for the new radiation safety program
	 * @return the new radiation safety program
	 */
	public RadiationSafetyProgram create(long radiationSafetyProgramId);

	/**
	 * Removes the radiation safety program with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param radiationSafetyProgramId the primary key of the radiation safety program
	 * @return the radiation safety program that was removed
	 * @throws NoSuchRadiationSafetyProgramException if a radiation safety program with the primary key could not be found
	 */
	public RadiationSafetyProgram remove(long radiationSafetyProgramId)
		throws NoSuchRadiationSafetyProgramException;

	public RadiationSafetyProgram updateImpl(
		RadiationSafetyProgram radiationSafetyProgram);

	/**
	 * Returns the radiation safety program with the primary key or throws a <code>NoSuchRadiationSafetyProgramException</code> if it could not be found.
	 *
	 * @param radiationSafetyProgramId the primary key of the radiation safety program
	 * @return the radiation safety program
	 * @throws NoSuchRadiationSafetyProgramException if a radiation safety program with the primary key could not be found
	 */
	public RadiationSafetyProgram findByPrimaryKey(
			long radiationSafetyProgramId)
		throws NoSuchRadiationSafetyProgramException;

	/**
	 * Returns the radiation safety program with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param radiationSafetyProgramId the primary key of the radiation safety program
	 * @return the radiation safety program, or <code>null</code> if a radiation safety program with the primary key could not be found
	 */
	public RadiationSafetyProgram fetchByPrimaryKey(
		long radiationSafetyProgramId);

	/**
	 * Returns all the radiation safety programs.
	 *
	 * @return the radiation safety programs
	 */
	public java.util.List<RadiationSafetyProgram> findAll();

	/**
	 * Returns a range of all the radiation safety programs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadiationSafetyProgramModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of radiation safety programs
	 * @param end the upper bound of the range of radiation safety programs (not inclusive)
	 * @return the range of radiation safety programs
	 */
	public java.util.List<RadiationSafetyProgram> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the radiation safety programs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadiationSafetyProgramModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of radiation safety programs
	 * @param end the upper bound of the range of radiation safety programs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of radiation safety programs
	 */
	public java.util.List<RadiationSafetyProgram> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<RadiationSafetyProgram>
			orderByComparator);

	/**
	 * Returns an ordered range of all the radiation safety programs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadiationSafetyProgramModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of radiation safety programs
	 * @param end the upper bound of the range of radiation safety programs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of radiation safety programs
	 */
	public java.util.List<RadiationSafetyProgram> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<RadiationSafetyProgram>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the radiation safety programs from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of radiation safety programs.
	 *
	 * @return the number of radiation safety programs
	 */
	public int countAll();

}