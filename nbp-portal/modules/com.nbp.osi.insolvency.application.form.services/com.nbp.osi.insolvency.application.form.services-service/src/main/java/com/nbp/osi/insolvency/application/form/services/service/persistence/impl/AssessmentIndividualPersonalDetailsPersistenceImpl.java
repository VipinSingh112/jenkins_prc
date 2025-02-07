/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service.persistence.impl;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import com.nbp.osi.insolvency.application.form.services.exception.NoSuchAssessmentIndividualPersonalDetailsException;
import com.nbp.osi.insolvency.application.form.services.model.AssessmentIndividualPersonalDetails;
import com.nbp.osi.insolvency.application.form.services.model.AssessmentIndividualPersonalDetailsTable;
import com.nbp.osi.insolvency.application.form.services.model.impl.AssessmentIndividualPersonalDetailsImpl;
import com.nbp.osi.insolvency.application.form.services.model.impl.AssessmentIndividualPersonalDetailsModelImpl;
import com.nbp.osi.insolvency.application.form.services.service.persistence.AssessmentIndividualPersonalDetailsPersistence;
import com.nbp.osi.insolvency.application.form.services.service.persistence.AssessmentIndividualPersonalDetailsUtil;
import com.nbp.osi.insolvency.application.form.services.service.persistence.impl.constants.OSI_INSOLVENCYPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the assessment individual personal details service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AssessmentIndividualPersonalDetailsPersistence.class)
public class AssessmentIndividualPersonalDetailsPersistenceImpl
	extends BasePersistenceImpl<AssessmentIndividualPersonalDetails>
	implements AssessmentIndividualPersonalDetailsPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AssessmentIndividualPersonalDetailsUtil</code> to access the assessment individual personal details persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AssessmentIndividualPersonalDetailsImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetOsiById;
	private FinderPath _finderPathCountBygetOsiById;

	/**
	 * Returns the assessment individual personal details where osiInsolvencyId = &#63; or throws a <code>NoSuchAssessmentIndividualPersonalDetailsException</code> if it could not be found.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching assessment individual personal details
	 * @throws NoSuchAssessmentIndividualPersonalDetailsException if a matching assessment individual personal details could not be found
	 */
	@Override
	public AssessmentIndividualPersonalDetails findBygetOsiById(
			long osiInsolvencyId)
		throws NoSuchAssessmentIndividualPersonalDetailsException {

		AssessmentIndividualPersonalDetails
			assessmentIndividualPersonalDetails = fetchBygetOsiById(
				osiInsolvencyId);

		if (assessmentIndividualPersonalDetails == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("osiInsolvencyId=");
			sb.append(osiInsolvencyId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchAssessmentIndividualPersonalDetailsException(
				sb.toString());
		}

		return assessmentIndividualPersonalDetails;
	}

	/**
	 * Returns the assessment individual personal details where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching assessment individual personal details, or <code>null</code> if a matching assessment individual personal details could not be found
	 */
	@Override
	public AssessmentIndividualPersonalDetails fetchBygetOsiById(
		long osiInsolvencyId) {

		return fetchBygetOsiById(osiInsolvencyId, true);
	}

	/**
	 * Returns the assessment individual personal details where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching assessment individual personal details, or <code>null</code> if a matching assessment individual personal details could not be found
	 */
	@Override
	public AssessmentIndividualPersonalDetails fetchBygetOsiById(
		long osiInsolvencyId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {osiInsolvencyId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetOsiById, finderArgs, this);
		}

		if (result instanceof AssessmentIndividualPersonalDetails) {
			AssessmentIndividualPersonalDetails
				assessmentIndividualPersonalDetails =
					(AssessmentIndividualPersonalDetails)result;

			if (osiInsolvencyId !=
					assessmentIndividualPersonalDetails.getOsiInsolvencyId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_ASSESSMENTINDIVIDUALPERSONALDETAILS_WHERE);

			sb.append(_FINDER_COLUMN_GETOSIBYID_OSIINSOLVENCYID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiInsolvencyId);

				List<AssessmentIndividualPersonalDetails> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetOsiById, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {osiInsolvencyId};
							}

							_log.warn(
								"AssessmentIndividualPersonalDetailsPersistenceImpl.fetchBygetOsiById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					AssessmentIndividualPersonalDetails
						assessmentIndividualPersonalDetails = list.get(0);

					result = assessmentIndividualPersonalDetails;

					cacheResult(assessmentIndividualPersonalDetails);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (AssessmentIndividualPersonalDetails)result;
		}
	}

	/**
	 * Removes the assessment individual personal details where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the assessment individual personal details that was removed
	 */
	@Override
	public AssessmentIndividualPersonalDetails removeBygetOsiById(
			long osiInsolvencyId)
		throws NoSuchAssessmentIndividualPersonalDetailsException {

		AssessmentIndividualPersonalDetails
			assessmentIndividualPersonalDetails = findBygetOsiById(
				osiInsolvencyId);

		return remove(assessmentIndividualPersonalDetails);
	}

	/**
	 * Returns the number of assessment individual personal detailses where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching assessment individual personal detailses
	 */
	@Override
	public int countBygetOsiById(long osiInsolvencyId) {
		FinderPath finderPath = _finderPathCountBygetOsiById;

		Object[] finderArgs = new Object[] {osiInsolvencyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ASSESSMENTINDIVIDUALPERSONALDETAILS_WHERE);

			sb.append(_FINDER_COLUMN_GETOSIBYID_OSIINSOLVENCYID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiInsolvencyId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_GETOSIBYID_OSIINSOLVENCYID_2 =
		"assessmentIndividualPersonalDetails.osiInsolvencyId = ?";

	public AssessmentIndividualPersonalDetailsPersistenceImpl() {
		setModelClass(AssessmentIndividualPersonalDetails.class);

		setModelImplClass(AssessmentIndividualPersonalDetailsImpl.class);
		setModelPKClass(long.class);

		setTable(AssessmentIndividualPersonalDetailsTable.INSTANCE);
	}

	/**
	 * Caches the assessment individual personal details in the entity cache if it is enabled.
	 *
	 * @param assessmentIndividualPersonalDetails the assessment individual personal details
	 */
	@Override
	public void cacheResult(
		AssessmentIndividualPersonalDetails
			assessmentIndividualPersonalDetails) {

		entityCache.putResult(
			AssessmentIndividualPersonalDetailsImpl.class,
			assessmentIndividualPersonalDetails.getPrimaryKey(),
			assessmentIndividualPersonalDetails);

		finderCache.putResult(
			_finderPathFetchBygetOsiById,
			new Object[] {
				assessmentIndividualPersonalDetails.getOsiInsolvencyId()
			},
			assessmentIndividualPersonalDetails);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the assessment individual personal detailses in the entity cache if it is enabled.
	 *
	 * @param assessmentIndividualPersonalDetailses the assessment individual personal detailses
	 */
	@Override
	public void cacheResult(
		List<AssessmentIndividualPersonalDetails>
			assessmentIndividualPersonalDetailses) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (assessmentIndividualPersonalDetailses.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AssessmentIndividualPersonalDetails
				assessmentIndividualPersonalDetails :
					assessmentIndividualPersonalDetailses) {

			if (entityCache.getResult(
					AssessmentIndividualPersonalDetailsImpl.class,
					assessmentIndividualPersonalDetails.getPrimaryKey()) ==
						null) {

				cacheResult(assessmentIndividualPersonalDetails);
			}
		}
	}

	/**
	 * Clears the cache for all assessment individual personal detailses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AssessmentIndividualPersonalDetailsImpl.class);

		finderCache.clearCache(AssessmentIndividualPersonalDetailsImpl.class);
	}

	/**
	 * Clears the cache for the assessment individual personal details.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		AssessmentIndividualPersonalDetails
			assessmentIndividualPersonalDetails) {

		entityCache.removeResult(
			AssessmentIndividualPersonalDetailsImpl.class,
			assessmentIndividualPersonalDetails);
	}

	@Override
	public void clearCache(
		List<AssessmentIndividualPersonalDetails>
			assessmentIndividualPersonalDetailses) {

		for (AssessmentIndividualPersonalDetails
				assessmentIndividualPersonalDetails :
					assessmentIndividualPersonalDetailses) {

			entityCache.removeResult(
				AssessmentIndividualPersonalDetailsImpl.class,
				assessmentIndividualPersonalDetails);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AssessmentIndividualPersonalDetailsImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				AssessmentIndividualPersonalDetailsImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		AssessmentIndividualPersonalDetailsModelImpl
			assessmentIndividualPersonalDetailsModelImpl) {

		Object[] args = new Object[] {
			assessmentIndividualPersonalDetailsModelImpl.getOsiInsolvencyId()
		};

		finderCache.putResult(
			_finderPathCountBygetOsiById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetOsiById, args,
			assessmentIndividualPersonalDetailsModelImpl);
	}

	/**
	 * Creates a new assessment individual personal details with the primary key. Does not add the assessment individual personal details to the database.
	 *
	 * @param assessmentDetailsId the primary key for the new assessment individual personal details
	 * @return the new assessment individual personal details
	 */
	@Override
	public AssessmentIndividualPersonalDetails create(
		long assessmentDetailsId) {

		AssessmentIndividualPersonalDetails
			assessmentIndividualPersonalDetails =
				new AssessmentIndividualPersonalDetailsImpl();

		assessmentIndividualPersonalDetails.setNew(true);
		assessmentIndividualPersonalDetails.setPrimaryKey(assessmentDetailsId);

		return assessmentIndividualPersonalDetails;
	}

	/**
	 * Removes the assessment individual personal details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param assessmentDetailsId the primary key of the assessment individual personal details
	 * @return the assessment individual personal details that was removed
	 * @throws NoSuchAssessmentIndividualPersonalDetailsException if a assessment individual personal details with the primary key could not be found
	 */
	@Override
	public AssessmentIndividualPersonalDetails remove(long assessmentDetailsId)
		throws NoSuchAssessmentIndividualPersonalDetailsException {

		return remove((Serializable)assessmentDetailsId);
	}

	/**
	 * Removes the assessment individual personal details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the assessment individual personal details
	 * @return the assessment individual personal details that was removed
	 * @throws NoSuchAssessmentIndividualPersonalDetailsException if a assessment individual personal details with the primary key could not be found
	 */
	@Override
	public AssessmentIndividualPersonalDetails remove(Serializable primaryKey)
		throws NoSuchAssessmentIndividualPersonalDetailsException {

		Session session = null;

		try {
			session = openSession();

			AssessmentIndividualPersonalDetails
				assessmentIndividualPersonalDetails =
					(AssessmentIndividualPersonalDetails)session.get(
						AssessmentIndividualPersonalDetailsImpl.class,
						primaryKey);

			if (assessmentIndividualPersonalDetails == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAssessmentIndividualPersonalDetailsException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(assessmentIndividualPersonalDetails);
		}
		catch (NoSuchAssessmentIndividualPersonalDetailsException
					noSuchEntityException) {

			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected AssessmentIndividualPersonalDetails removeImpl(
		AssessmentIndividualPersonalDetails
			assessmentIndividualPersonalDetails) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(assessmentIndividualPersonalDetails)) {
				assessmentIndividualPersonalDetails =
					(AssessmentIndividualPersonalDetails)session.get(
						AssessmentIndividualPersonalDetailsImpl.class,
						assessmentIndividualPersonalDetails.getPrimaryKeyObj());
			}

			if (assessmentIndividualPersonalDetails != null) {
				session.delete(assessmentIndividualPersonalDetails);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (assessmentIndividualPersonalDetails != null) {
			clearCache(assessmentIndividualPersonalDetails);
		}

		return assessmentIndividualPersonalDetails;
	}

	@Override
	public AssessmentIndividualPersonalDetails updateImpl(
		AssessmentIndividualPersonalDetails
			assessmentIndividualPersonalDetails) {

		boolean isNew = assessmentIndividualPersonalDetails.isNew();

		if (!(assessmentIndividualPersonalDetails instanceof
				AssessmentIndividualPersonalDetailsModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					assessmentIndividualPersonalDetails.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					assessmentIndividualPersonalDetails);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in assessmentIndividualPersonalDetails proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AssessmentIndividualPersonalDetails implementation " +
					assessmentIndividualPersonalDetails.getClass());
		}

		AssessmentIndividualPersonalDetailsModelImpl
			assessmentIndividualPersonalDetailsModelImpl =
				(AssessmentIndividualPersonalDetailsModelImpl)
					assessmentIndividualPersonalDetails;

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(assessmentIndividualPersonalDetails);
			}
			else {
				assessmentIndividualPersonalDetails =
					(AssessmentIndividualPersonalDetails)session.merge(
						assessmentIndividualPersonalDetails);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AssessmentIndividualPersonalDetailsImpl.class,
			assessmentIndividualPersonalDetailsModelImpl, false, true);

		cacheUniqueFindersCache(assessmentIndividualPersonalDetailsModelImpl);

		if (isNew) {
			assessmentIndividualPersonalDetails.setNew(false);
		}

		assessmentIndividualPersonalDetails.resetOriginalValues();

		return assessmentIndividualPersonalDetails;
	}

	/**
	 * Returns the assessment individual personal details with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the assessment individual personal details
	 * @return the assessment individual personal details
	 * @throws NoSuchAssessmentIndividualPersonalDetailsException if a assessment individual personal details with the primary key could not be found
	 */
	@Override
	public AssessmentIndividualPersonalDetails findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchAssessmentIndividualPersonalDetailsException {

		AssessmentIndividualPersonalDetails
			assessmentIndividualPersonalDetails = fetchByPrimaryKey(primaryKey);

		if (assessmentIndividualPersonalDetails == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAssessmentIndividualPersonalDetailsException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return assessmentIndividualPersonalDetails;
	}

	/**
	 * Returns the assessment individual personal details with the primary key or throws a <code>NoSuchAssessmentIndividualPersonalDetailsException</code> if it could not be found.
	 *
	 * @param assessmentDetailsId the primary key of the assessment individual personal details
	 * @return the assessment individual personal details
	 * @throws NoSuchAssessmentIndividualPersonalDetailsException if a assessment individual personal details with the primary key could not be found
	 */
	@Override
	public AssessmentIndividualPersonalDetails findByPrimaryKey(
			long assessmentDetailsId)
		throws NoSuchAssessmentIndividualPersonalDetailsException {

		return findByPrimaryKey((Serializable)assessmentDetailsId);
	}

	/**
	 * Returns the assessment individual personal details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param assessmentDetailsId the primary key of the assessment individual personal details
	 * @return the assessment individual personal details, or <code>null</code> if a assessment individual personal details with the primary key could not be found
	 */
	@Override
	public AssessmentIndividualPersonalDetails fetchByPrimaryKey(
		long assessmentDetailsId) {

		return fetchByPrimaryKey((Serializable)assessmentDetailsId);
	}

	/**
	 * Returns all the assessment individual personal detailses.
	 *
	 * @return the assessment individual personal detailses
	 */
	@Override
	public List<AssessmentIndividualPersonalDetails> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the assessment individual personal detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssessmentIndividualPersonalDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of assessment individual personal detailses
	 * @param end the upper bound of the range of assessment individual personal detailses (not inclusive)
	 * @return the range of assessment individual personal detailses
	 */
	@Override
	public List<AssessmentIndividualPersonalDetails> findAll(
		int start, int end) {

		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the assessment individual personal detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssessmentIndividualPersonalDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of assessment individual personal detailses
	 * @param end the upper bound of the range of assessment individual personal detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of assessment individual personal detailses
	 */
	@Override
	public List<AssessmentIndividualPersonalDetails> findAll(
		int start, int end,
		OrderByComparator<AssessmentIndividualPersonalDetails>
			orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the assessment individual personal detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssessmentIndividualPersonalDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of assessment individual personal detailses
	 * @param end the upper bound of the range of assessment individual personal detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of assessment individual personal detailses
	 */
	@Override
	public List<AssessmentIndividualPersonalDetails> findAll(
		int start, int end,
		OrderByComparator<AssessmentIndividualPersonalDetails>
			orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<AssessmentIndividualPersonalDetails> list = null;

		if (useFinderCache) {
			list =
				(List<AssessmentIndividualPersonalDetails>)
					finderCache.getResult(finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ASSESSMENTINDIVIDUALPERSONALDETAILS);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ASSESSMENTINDIVIDUALPERSONALDETAILS;

				sql = sql.concat(
					AssessmentIndividualPersonalDetailsModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list =
					(List<AssessmentIndividualPersonalDetails>)QueryUtil.list(
						query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the assessment individual personal detailses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AssessmentIndividualPersonalDetails
				assessmentIndividualPersonalDetails : findAll()) {

			remove(assessmentIndividualPersonalDetails);
		}
	}

	/**
	 * Returns the number of assessment individual personal detailses.
	 *
	 * @return the number of assessment individual personal detailses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(
					_SQL_COUNT_ASSESSMENTINDIVIDUALPERSONALDETAILS);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "assessmentDetailsId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ASSESSMENTINDIVIDUALPERSONALDETAILS;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AssessmentIndividualPersonalDetailsModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the assessment individual personal details persistence.
	 */
	@Activate
	public void activate() {
		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		_finderPathFetchBygetOsiById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetOsiById",
			new String[] {Long.class.getName()},
			new String[] {"osiInsolvencyId"}, true);

		_finderPathCountBygetOsiById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetOsiById",
			new String[] {Long.class.getName()},
			new String[] {"osiInsolvencyId"}, false);

		AssessmentIndividualPersonalDetailsUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AssessmentIndividualPersonalDetailsUtil.setPersistence(null);

		entityCache.removeCache(
			AssessmentIndividualPersonalDetailsImpl.class.getName());
	}

	@Override
	@Reference(
		target = OSI_INSOLVENCYPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = OSI_INSOLVENCYPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = OSI_INSOLVENCYPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String
		_SQL_SELECT_ASSESSMENTINDIVIDUALPERSONALDETAILS =
			"SELECT assessmentIndividualPersonalDetails FROM AssessmentIndividualPersonalDetails assessmentIndividualPersonalDetails";

	private static final String
		_SQL_SELECT_ASSESSMENTINDIVIDUALPERSONALDETAILS_WHERE =
			"SELECT assessmentIndividualPersonalDetails FROM AssessmentIndividualPersonalDetails assessmentIndividualPersonalDetails WHERE ";

	private static final String _SQL_COUNT_ASSESSMENTINDIVIDUALPERSONALDETAILS =
		"SELECT COUNT(assessmentIndividualPersonalDetails) FROM AssessmentIndividualPersonalDetails assessmentIndividualPersonalDetails";

	private static final String
		_SQL_COUNT_ASSESSMENTINDIVIDUALPERSONALDETAILS_WHERE =
			"SELECT COUNT(assessmentIndividualPersonalDetails) FROM AssessmentIndividualPersonalDetails assessmentIndividualPersonalDetails WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"assessmentIndividualPersonalDetails.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AssessmentIndividualPersonalDetails exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AssessmentIndividualPersonalDetails exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AssessmentIndividualPersonalDetailsPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}