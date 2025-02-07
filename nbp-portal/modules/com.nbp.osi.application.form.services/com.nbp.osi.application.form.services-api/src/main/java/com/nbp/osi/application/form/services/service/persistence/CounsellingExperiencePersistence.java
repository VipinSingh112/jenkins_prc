/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.osi.application.form.services.exception.NoSuchCounsellingExperienceException;
import com.nbp.osi.application.form.services.model.CounsellingExperience;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the counselling experience service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CounsellingExperienceUtil
 * @generated
 */
@ProviderType
public interface CounsellingExperiencePersistence
	extends BasePersistence<CounsellingExperience> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CounsellingExperienceUtil} to access the counselling experience persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the counselling experiences where osiApplicationId = &#63;.
	 *
	 * @param osiApplicationId the osi application ID
	 * @return the matching counselling experiences
	 */
	public java.util.List<CounsellingExperience> findBygetOsiById(
		long osiApplicationId);

	/**
	 * Returns a range of all the counselling experiences where osiApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CounsellingExperienceModelImpl</code>.
	 * </p>
	 *
	 * @param osiApplicationId the osi application ID
	 * @param start the lower bound of the range of counselling experiences
	 * @param end the upper bound of the range of counselling experiences (not inclusive)
	 * @return the range of matching counselling experiences
	 */
	public java.util.List<CounsellingExperience> findBygetOsiById(
		long osiApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the counselling experiences where osiApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CounsellingExperienceModelImpl</code>.
	 * </p>
	 *
	 * @param osiApplicationId the osi application ID
	 * @param start the lower bound of the range of counselling experiences
	 * @param end the upper bound of the range of counselling experiences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching counselling experiences
	 */
	public java.util.List<CounsellingExperience> findBygetOsiById(
		long osiApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CounsellingExperience>
			orderByComparator);

	/**
	 * Returns an ordered range of all the counselling experiences where osiApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CounsellingExperienceModelImpl</code>.
	 * </p>
	 *
	 * @param osiApplicationId the osi application ID
	 * @param start the lower bound of the range of counselling experiences
	 * @param end the upper bound of the range of counselling experiences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching counselling experiences
	 */
	public java.util.List<CounsellingExperience> findBygetOsiById(
		long osiApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CounsellingExperience>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first counselling experience in the ordered set where osiApplicationId = &#63;.
	 *
	 * @param osiApplicationId the osi application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching counselling experience
	 * @throws NoSuchCounsellingExperienceException if a matching counselling experience could not be found
	 */
	public CounsellingExperience findBygetOsiById_First(
			long osiApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CounsellingExperience> orderByComparator)
		throws NoSuchCounsellingExperienceException;

	/**
	 * Returns the first counselling experience in the ordered set where osiApplicationId = &#63;.
	 *
	 * @param osiApplicationId the osi application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching counselling experience, or <code>null</code> if a matching counselling experience could not be found
	 */
	public CounsellingExperience fetchBygetOsiById_First(
		long osiApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<CounsellingExperience>
			orderByComparator);

	/**
	 * Returns the last counselling experience in the ordered set where osiApplicationId = &#63;.
	 *
	 * @param osiApplicationId the osi application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching counselling experience
	 * @throws NoSuchCounsellingExperienceException if a matching counselling experience could not be found
	 */
	public CounsellingExperience findBygetOsiById_Last(
			long osiApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CounsellingExperience> orderByComparator)
		throws NoSuchCounsellingExperienceException;

	/**
	 * Returns the last counselling experience in the ordered set where osiApplicationId = &#63;.
	 *
	 * @param osiApplicationId the osi application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching counselling experience, or <code>null</code> if a matching counselling experience could not be found
	 */
	public CounsellingExperience fetchBygetOsiById_Last(
		long osiApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<CounsellingExperience>
			orderByComparator);

	/**
	 * Returns the counselling experiences before and after the current counselling experience in the ordered set where osiApplicationId = &#63;.
	 *
	 * @param counsellingExperienceId the primary key of the current counselling experience
	 * @param osiApplicationId the osi application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next counselling experience
	 * @throws NoSuchCounsellingExperienceException if a counselling experience with the primary key could not be found
	 */
	public CounsellingExperience[] findBygetOsiById_PrevAndNext(
			long counsellingExperienceId, long osiApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CounsellingExperience> orderByComparator)
		throws NoSuchCounsellingExperienceException;

	/**
	 * Removes all the counselling experiences where osiApplicationId = &#63; from the database.
	 *
	 * @param osiApplicationId the osi application ID
	 */
	public void removeBygetOsiById(long osiApplicationId);

	/**
	 * Returns the number of counselling experiences where osiApplicationId = &#63;.
	 *
	 * @param osiApplicationId the osi application ID
	 * @return the number of matching counselling experiences
	 */
	public int countBygetOsiById(long osiApplicationId);

	/**
	 * Caches the counselling experience in the entity cache if it is enabled.
	 *
	 * @param counsellingExperience the counselling experience
	 */
	public void cacheResult(CounsellingExperience counsellingExperience);

	/**
	 * Caches the counselling experiences in the entity cache if it is enabled.
	 *
	 * @param counsellingExperiences the counselling experiences
	 */
	public void cacheResult(
		java.util.List<CounsellingExperience> counsellingExperiences);

	/**
	 * Creates a new counselling experience with the primary key. Does not add the counselling experience to the database.
	 *
	 * @param counsellingExperienceId the primary key for the new counselling experience
	 * @return the new counselling experience
	 */
	public CounsellingExperience create(long counsellingExperienceId);

	/**
	 * Removes the counselling experience with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param counsellingExperienceId the primary key of the counselling experience
	 * @return the counselling experience that was removed
	 * @throws NoSuchCounsellingExperienceException if a counselling experience with the primary key could not be found
	 */
	public CounsellingExperience remove(long counsellingExperienceId)
		throws NoSuchCounsellingExperienceException;

	public CounsellingExperience updateImpl(
		CounsellingExperience counsellingExperience);

	/**
	 * Returns the counselling experience with the primary key or throws a <code>NoSuchCounsellingExperienceException</code> if it could not be found.
	 *
	 * @param counsellingExperienceId the primary key of the counselling experience
	 * @return the counselling experience
	 * @throws NoSuchCounsellingExperienceException if a counselling experience with the primary key could not be found
	 */
	public CounsellingExperience findByPrimaryKey(long counsellingExperienceId)
		throws NoSuchCounsellingExperienceException;

	/**
	 * Returns the counselling experience with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param counsellingExperienceId the primary key of the counselling experience
	 * @return the counselling experience, or <code>null</code> if a counselling experience with the primary key could not be found
	 */
	public CounsellingExperience fetchByPrimaryKey(
		long counsellingExperienceId);

	/**
	 * Returns all the counselling experiences.
	 *
	 * @return the counselling experiences
	 */
	public java.util.List<CounsellingExperience> findAll();

	/**
	 * Returns a range of all the counselling experiences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CounsellingExperienceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of counselling experiences
	 * @param end the upper bound of the range of counselling experiences (not inclusive)
	 * @return the range of counselling experiences
	 */
	public java.util.List<CounsellingExperience> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the counselling experiences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CounsellingExperienceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of counselling experiences
	 * @param end the upper bound of the range of counselling experiences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of counselling experiences
	 */
	public java.util.List<CounsellingExperience> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CounsellingExperience>
			orderByComparator);

	/**
	 * Returns an ordered range of all the counselling experiences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CounsellingExperienceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of counselling experiences
	 * @param end the upper bound of the range of counselling experiences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of counselling experiences
	 */
	public java.util.List<CounsellingExperience> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CounsellingExperience>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the counselling experiences from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of counselling experiences.
	 *
	 * @return the number of counselling experiences
	 */
	public int countAll();

}