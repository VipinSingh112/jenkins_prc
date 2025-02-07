/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.application.form.service.service.persistence.impl;

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
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import com.nbp.acquire.application.form.service.exception.NoSuchAcquireLandApplicantDetailsException;
import com.nbp.acquire.application.form.service.model.AcquireLandApplicantDetails;
import com.nbp.acquire.application.form.service.model.AcquireLandApplicantDetailsTable;
import com.nbp.acquire.application.form.service.model.impl.AcquireLandApplicantDetailsImpl;
import com.nbp.acquire.application.form.service.model.impl.AcquireLandApplicantDetailsModelImpl;
import com.nbp.acquire.application.form.service.service.persistence.AcquireLandApplicantDetailsPersistence;
import com.nbp.acquire.application.form.service.service.persistence.AcquireLandApplicantDetailsUtil;
import com.nbp.acquire.application.form.service.service.persistence.impl.constants.ACQUIREPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the acquire land applicant details service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AcquireLandApplicantDetailsPersistence.class)
public class AcquireLandApplicantDetailsPersistenceImpl
	extends BasePersistenceImpl<AcquireLandApplicantDetails>
	implements AcquireLandApplicantDetailsPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AcquireLandApplicantDetailsUtil</code> to access the acquire land applicant details persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AcquireLandApplicantDetailsImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetAcquireById;
	private FinderPath _finderPathCountBygetAcquireById;

	/**
	 * Returns the acquire land applicant details where acquireApplicationId = &#63; or throws a <code>NoSuchAcquireLandApplicantDetailsException</code> if it could not be found.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the matching acquire land applicant details
	 * @throws NoSuchAcquireLandApplicantDetailsException if a matching acquire land applicant details could not be found
	 */
	@Override
	public AcquireLandApplicantDetails findBygetAcquireById(
			long acquireApplicationId)
		throws NoSuchAcquireLandApplicantDetailsException {

		AcquireLandApplicantDetails acquireLandApplicantDetails =
			fetchBygetAcquireById(acquireApplicationId);

		if (acquireLandApplicantDetails == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("acquireApplicationId=");
			sb.append(acquireApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchAcquireLandApplicantDetailsException(sb.toString());
		}

		return acquireLandApplicantDetails;
	}

	/**
	 * Returns the acquire land applicant details where acquireApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the matching acquire land applicant details, or <code>null</code> if a matching acquire land applicant details could not be found
	 */
	@Override
	public AcquireLandApplicantDetails fetchBygetAcquireById(
		long acquireApplicationId) {

		return fetchBygetAcquireById(acquireApplicationId, true);
	}

	/**
	 * Returns the acquire land applicant details where acquireApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acquire land applicant details, or <code>null</code> if a matching acquire land applicant details could not be found
	 */
	@Override
	public AcquireLandApplicantDetails fetchBygetAcquireById(
		long acquireApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {acquireApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetAcquireById, finderArgs, this);
		}

		if (result instanceof AcquireLandApplicantDetails) {
			AcquireLandApplicantDetails acquireLandApplicantDetails =
				(AcquireLandApplicantDetails)result;

			if (acquireApplicationId !=
					acquireLandApplicantDetails.getAcquireApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_ACQUIRELANDAPPLICANTDETAILS_WHERE);

			sb.append(_FINDER_COLUMN_GETACQUIREBYID_ACQUIREAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(acquireApplicationId);

				List<AcquireLandApplicantDetails> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetAcquireById, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									acquireApplicationId
								};
							}

							_log.warn(
								"AcquireLandApplicantDetailsPersistenceImpl.fetchBygetAcquireById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					AcquireLandApplicantDetails acquireLandApplicantDetails =
						list.get(0);

					result = acquireLandApplicantDetails;

					cacheResult(acquireLandApplicantDetails);
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
			return (AcquireLandApplicantDetails)result;
		}
	}

	/**
	 * Removes the acquire land applicant details where acquireApplicationId = &#63; from the database.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the acquire land applicant details that was removed
	 */
	@Override
	public AcquireLandApplicantDetails removeBygetAcquireById(
			long acquireApplicationId)
		throws NoSuchAcquireLandApplicantDetailsException {

		AcquireLandApplicantDetails acquireLandApplicantDetails =
			findBygetAcquireById(acquireApplicationId);

		return remove(acquireLandApplicantDetails);
	}

	/**
	 * Returns the number of acquire land applicant detailses where acquireApplicationId = &#63;.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the number of matching acquire land applicant detailses
	 */
	@Override
	public int countBygetAcquireById(long acquireApplicationId) {
		FinderPath finderPath = _finderPathCountBygetAcquireById;

		Object[] finderArgs = new Object[] {acquireApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ACQUIRELANDAPPLICANTDETAILS_WHERE);

			sb.append(_FINDER_COLUMN_GETACQUIREBYID_ACQUIREAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(acquireApplicationId);

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

	private static final String
		_FINDER_COLUMN_GETACQUIREBYID_ACQUIREAPPLICATIONID_2 =
			"acquireLandApplicantDetails.acquireApplicationId = ?";

	public AcquireLandApplicantDetailsPersistenceImpl() {
		setModelClass(AcquireLandApplicantDetails.class);

		setModelImplClass(AcquireLandApplicantDetailsImpl.class);
		setModelPKClass(long.class);

		setTable(AcquireLandApplicantDetailsTable.INSTANCE);
	}

	/**
	 * Caches the acquire land applicant details in the entity cache if it is enabled.
	 *
	 * @param acquireLandApplicantDetails the acquire land applicant details
	 */
	@Override
	public void cacheResult(
		AcquireLandApplicantDetails acquireLandApplicantDetails) {

		entityCache.putResult(
			AcquireLandApplicantDetailsImpl.class,
			acquireLandApplicantDetails.getPrimaryKey(),
			acquireLandApplicantDetails);

		finderCache.putResult(
			_finderPathFetchBygetAcquireById,
			new Object[] {
				acquireLandApplicantDetails.getAcquireApplicationId()
			},
			acquireLandApplicantDetails);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the acquire land applicant detailses in the entity cache if it is enabled.
	 *
	 * @param acquireLandApplicantDetailses the acquire land applicant detailses
	 */
	@Override
	public void cacheResult(
		List<AcquireLandApplicantDetails> acquireLandApplicantDetailses) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (acquireLandApplicantDetailses.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AcquireLandApplicantDetails acquireLandApplicantDetails :
				acquireLandApplicantDetailses) {

			if (entityCache.getResult(
					AcquireLandApplicantDetailsImpl.class,
					acquireLandApplicantDetails.getPrimaryKey()) == null) {

				cacheResult(acquireLandApplicantDetails);
			}
		}
	}

	/**
	 * Clears the cache for all acquire land applicant detailses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AcquireLandApplicantDetailsImpl.class);

		finderCache.clearCache(AcquireLandApplicantDetailsImpl.class);
	}

	/**
	 * Clears the cache for the acquire land applicant details.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		AcquireLandApplicantDetails acquireLandApplicantDetails) {

		entityCache.removeResult(
			AcquireLandApplicantDetailsImpl.class, acquireLandApplicantDetails);
	}

	@Override
	public void clearCache(
		List<AcquireLandApplicantDetails> acquireLandApplicantDetailses) {

		for (AcquireLandApplicantDetails acquireLandApplicantDetails :
				acquireLandApplicantDetailses) {

			entityCache.removeResult(
				AcquireLandApplicantDetailsImpl.class,
				acquireLandApplicantDetails);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AcquireLandApplicantDetailsImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				AcquireLandApplicantDetailsImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		AcquireLandApplicantDetailsModelImpl
			acquireLandApplicantDetailsModelImpl) {

		Object[] args = new Object[] {
			acquireLandApplicantDetailsModelImpl.getAcquireApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetAcquireById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetAcquireById, args,
			acquireLandApplicantDetailsModelImpl);
	}

	/**
	 * Creates a new acquire land applicant details with the primary key. Does not add the acquire land applicant details to the database.
	 *
	 * @param acquireLandApplicantDetailsId the primary key for the new acquire land applicant details
	 * @return the new acquire land applicant details
	 */
	@Override
	public AcquireLandApplicantDetails create(
		long acquireLandApplicantDetailsId) {

		AcquireLandApplicantDetails acquireLandApplicantDetails =
			new AcquireLandApplicantDetailsImpl();

		acquireLandApplicantDetails.setNew(true);
		acquireLandApplicantDetails.setPrimaryKey(
			acquireLandApplicantDetailsId);

		acquireLandApplicantDetails.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return acquireLandApplicantDetails;
	}

	/**
	 * Removes the acquire land applicant details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param acquireLandApplicantDetailsId the primary key of the acquire land applicant details
	 * @return the acquire land applicant details that was removed
	 * @throws NoSuchAcquireLandApplicantDetailsException if a acquire land applicant details with the primary key could not be found
	 */
	@Override
	public AcquireLandApplicantDetails remove(
			long acquireLandApplicantDetailsId)
		throws NoSuchAcquireLandApplicantDetailsException {

		return remove((Serializable)acquireLandApplicantDetailsId);
	}

	/**
	 * Removes the acquire land applicant details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the acquire land applicant details
	 * @return the acquire land applicant details that was removed
	 * @throws NoSuchAcquireLandApplicantDetailsException if a acquire land applicant details with the primary key could not be found
	 */
	@Override
	public AcquireLandApplicantDetails remove(Serializable primaryKey)
		throws NoSuchAcquireLandApplicantDetailsException {

		Session session = null;

		try {
			session = openSession();

			AcquireLandApplicantDetails acquireLandApplicantDetails =
				(AcquireLandApplicantDetails)session.get(
					AcquireLandApplicantDetailsImpl.class, primaryKey);

			if (acquireLandApplicantDetails == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAcquireLandApplicantDetailsException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(acquireLandApplicantDetails);
		}
		catch (NoSuchAcquireLandApplicantDetailsException
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
	protected AcquireLandApplicantDetails removeImpl(
		AcquireLandApplicantDetails acquireLandApplicantDetails) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(acquireLandApplicantDetails)) {
				acquireLandApplicantDetails =
					(AcquireLandApplicantDetails)session.get(
						AcquireLandApplicantDetailsImpl.class,
						acquireLandApplicantDetails.getPrimaryKeyObj());
			}

			if (acquireLandApplicantDetails != null) {
				session.delete(acquireLandApplicantDetails);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (acquireLandApplicantDetails != null) {
			clearCache(acquireLandApplicantDetails);
		}

		return acquireLandApplicantDetails;
	}

	@Override
	public AcquireLandApplicantDetails updateImpl(
		AcquireLandApplicantDetails acquireLandApplicantDetails) {

		boolean isNew = acquireLandApplicantDetails.isNew();

		if (!(acquireLandApplicantDetails instanceof
				AcquireLandApplicantDetailsModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					acquireLandApplicantDetails.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					acquireLandApplicantDetails);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in acquireLandApplicantDetails proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AcquireLandApplicantDetails implementation " +
					acquireLandApplicantDetails.getClass());
		}

		AcquireLandApplicantDetailsModelImpl
			acquireLandApplicantDetailsModelImpl =
				(AcquireLandApplicantDetailsModelImpl)
					acquireLandApplicantDetails;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (acquireLandApplicantDetails.getCreateDate() == null)) {
			if (serviceContext == null) {
				acquireLandApplicantDetails.setCreateDate(date);
			}
			else {
				acquireLandApplicantDetails.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!acquireLandApplicantDetailsModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				acquireLandApplicantDetails.setModifiedDate(date);
			}
			else {
				acquireLandApplicantDetails.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(acquireLandApplicantDetails);
			}
			else {
				acquireLandApplicantDetails =
					(AcquireLandApplicantDetails)session.merge(
						acquireLandApplicantDetails);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AcquireLandApplicantDetailsImpl.class,
			acquireLandApplicantDetailsModelImpl, false, true);

		cacheUniqueFindersCache(acquireLandApplicantDetailsModelImpl);

		if (isNew) {
			acquireLandApplicantDetails.setNew(false);
		}

		acquireLandApplicantDetails.resetOriginalValues();

		return acquireLandApplicantDetails;
	}

	/**
	 * Returns the acquire land applicant details with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the acquire land applicant details
	 * @return the acquire land applicant details
	 * @throws NoSuchAcquireLandApplicantDetailsException if a acquire land applicant details with the primary key could not be found
	 */
	@Override
	public AcquireLandApplicantDetails findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAcquireLandApplicantDetailsException {

		AcquireLandApplicantDetails acquireLandApplicantDetails =
			fetchByPrimaryKey(primaryKey);

		if (acquireLandApplicantDetails == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAcquireLandApplicantDetailsException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return acquireLandApplicantDetails;
	}

	/**
	 * Returns the acquire land applicant details with the primary key or throws a <code>NoSuchAcquireLandApplicantDetailsException</code> if it could not be found.
	 *
	 * @param acquireLandApplicantDetailsId the primary key of the acquire land applicant details
	 * @return the acquire land applicant details
	 * @throws NoSuchAcquireLandApplicantDetailsException if a acquire land applicant details with the primary key could not be found
	 */
	@Override
	public AcquireLandApplicantDetails findByPrimaryKey(
			long acquireLandApplicantDetailsId)
		throws NoSuchAcquireLandApplicantDetailsException {

		return findByPrimaryKey((Serializable)acquireLandApplicantDetailsId);
	}

	/**
	 * Returns the acquire land applicant details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param acquireLandApplicantDetailsId the primary key of the acquire land applicant details
	 * @return the acquire land applicant details, or <code>null</code> if a acquire land applicant details with the primary key could not be found
	 */
	@Override
	public AcquireLandApplicantDetails fetchByPrimaryKey(
		long acquireLandApplicantDetailsId) {

		return fetchByPrimaryKey((Serializable)acquireLandApplicantDetailsId);
	}

	/**
	 * Returns all the acquire land applicant detailses.
	 *
	 * @return the acquire land applicant detailses
	 */
	@Override
	public List<AcquireLandApplicantDetails> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the acquire land applicant detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireLandApplicantDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire land applicant detailses
	 * @param end the upper bound of the range of acquire land applicant detailses (not inclusive)
	 * @return the range of acquire land applicant detailses
	 */
	@Override
	public List<AcquireLandApplicantDetails> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the acquire land applicant detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireLandApplicantDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire land applicant detailses
	 * @param end the upper bound of the range of acquire land applicant detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acquire land applicant detailses
	 */
	@Override
	public List<AcquireLandApplicantDetails> findAll(
		int start, int end,
		OrderByComparator<AcquireLandApplicantDetails> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the acquire land applicant detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireLandApplicantDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire land applicant detailses
	 * @param end the upper bound of the range of acquire land applicant detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acquire land applicant detailses
	 */
	@Override
	public List<AcquireLandApplicantDetails> findAll(
		int start, int end,
		OrderByComparator<AcquireLandApplicantDetails> orderByComparator,
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

		List<AcquireLandApplicantDetails> list = null;

		if (useFinderCache) {
			list = (List<AcquireLandApplicantDetails>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ACQUIRELANDAPPLICANTDETAILS);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ACQUIRELANDAPPLICANTDETAILS;

				sql = sql.concat(
					AcquireLandApplicantDetailsModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AcquireLandApplicantDetails>)QueryUtil.list(
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
	 * Removes all the acquire land applicant detailses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AcquireLandApplicantDetails acquireLandApplicantDetails :
				findAll()) {

			remove(acquireLandApplicantDetails);
		}
	}

	/**
	 * Returns the number of acquire land applicant detailses.
	 *
	 * @return the number of acquire land applicant detailses
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
					_SQL_COUNT_ACQUIRELANDAPPLICANTDETAILS);

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
		return "acquireLandApplicantDetailsId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ACQUIRELANDAPPLICANTDETAILS;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AcquireLandApplicantDetailsModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the acquire land applicant details persistence.
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

		_finderPathFetchBygetAcquireById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetAcquireById",
			new String[] {Long.class.getName()},
			new String[] {"acquireApplicationId"}, true);

		_finderPathCountBygetAcquireById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetAcquireById",
			new String[] {Long.class.getName()},
			new String[] {"acquireApplicationId"}, false);

		AcquireLandApplicantDetailsUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AcquireLandApplicantDetailsUtil.setPersistence(null);

		entityCache.removeCache(
			AcquireLandApplicantDetailsImpl.class.getName());
	}

	@Override
	@Reference(
		target = ACQUIREPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = ACQUIREPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = ACQUIREPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_ACQUIRELANDAPPLICANTDETAILS =
		"SELECT acquireLandApplicantDetails FROM AcquireLandApplicantDetails acquireLandApplicantDetails";

	private static final String _SQL_SELECT_ACQUIRELANDAPPLICANTDETAILS_WHERE =
		"SELECT acquireLandApplicantDetails FROM AcquireLandApplicantDetails acquireLandApplicantDetails WHERE ";

	private static final String _SQL_COUNT_ACQUIRELANDAPPLICANTDETAILS =
		"SELECT COUNT(acquireLandApplicantDetails) FROM AcquireLandApplicantDetails acquireLandApplicantDetails";

	private static final String _SQL_COUNT_ACQUIRELANDAPPLICANTDETAILS_WHERE =
		"SELECT COUNT(acquireLandApplicantDetails) FROM AcquireLandApplicantDetails acquireLandApplicantDetails WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"acquireLandApplicantDetails.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AcquireLandApplicantDetails exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AcquireLandApplicantDetails exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AcquireLandApplicantDetailsPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}