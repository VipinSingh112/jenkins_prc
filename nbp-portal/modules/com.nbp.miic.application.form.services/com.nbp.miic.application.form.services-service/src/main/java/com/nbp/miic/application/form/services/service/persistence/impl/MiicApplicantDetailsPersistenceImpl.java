/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.application.form.services.service.persistence.impl;

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

import com.nbp.miic.application.form.services.exception.NoSuchMiicApplicantDetailsException;
import com.nbp.miic.application.form.services.model.MiicApplicantDetails;
import com.nbp.miic.application.form.services.model.MiicApplicantDetailsTable;
import com.nbp.miic.application.form.services.model.impl.MiicApplicantDetailsImpl;
import com.nbp.miic.application.form.services.model.impl.MiicApplicantDetailsModelImpl;
import com.nbp.miic.application.form.services.service.persistence.MiicApplicantDetailsPersistence;
import com.nbp.miic.application.form.services.service.persistence.MiicApplicantDetailsUtil;
import com.nbp.miic.application.form.services.service.persistence.impl.constants.MIIC_SERVICESPersistenceConstants;

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
 * The persistence implementation for the miic applicant details service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = MiicApplicantDetailsPersistence.class)
public class MiicApplicantDetailsPersistenceImpl
	extends BasePersistenceImpl<MiicApplicantDetails>
	implements MiicApplicantDetailsPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>MiicApplicantDetailsUtil</code> to access the miic applicant details persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		MiicApplicantDetailsImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetMiicById;
	private FinderPath _finderPathCountBygetMiicById;

	/**
	 * Returns the miic applicant details where miicApplicationId = &#63; or throws a <code>NoSuchMiicApplicantDetailsException</code> if it could not be found.
	 *
	 * @param miicApplicationId the miic application ID
	 * @return the matching miic applicant details
	 * @throws NoSuchMiicApplicantDetailsException if a matching miic applicant details could not be found
	 */
	@Override
	public MiicApplicantDetails findBygetMiicById(long miicApplicationId)
		throws NoSuchMiicApplicantDetailsException {

		MiicApplicantDetails miicApplicantDetails = fetchBygetMiicById(
			miicApplicationId);

		if (miicApplicantDetails == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("miicApplicationId=");
			sb.append(miicApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchMiicApplicantDetailsException(sb.toString());
		}

		return miicApplicantDetails;
	}

	/**
	 * Returns the miic applicant details where miicApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param miicApplicationId the miic application ID
	 * @return the matching miic applicant details, or <code>null</code> if a matching miic applicant details could not be found
	 */
	@Override
	public MiicApplicantDetails fetchBygetMiicById(long miicApplicationId) {
		return fetchBygetMiicById(miicApplicationId, true);
	}

	/**
	 * Returns the miic applicant details where miicApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param miicApplicationId the miic application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching miic applicant details, or <code>null</code> if a matching miic applicant details could not be found
	 */
	@Override
	public MiicApplicantDetails fetchBygetMiicById(
		long miicApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {miicApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetMiicById, finderArgs, this);
		}

		if (result instanceof MiicApplicantDetails) {
			MiicApplicantDetails miicApplicantDetails =
				(MiicApplicantDetails)result;

			if (miicApplicationId !=
					miicApplicantDetails.getMiicApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_MIICAPPLICANTDETAILS_WHERE);

			sb.append(_FINDER_COLUMN_GETMIICBYID_MIICAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(miicApplicationId);

				List<MiicApplicantDetails> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetMiicById, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {miicApplicationId};
							}

							_log.warn(
								"MiicApplicantDetailsPersistenceImpl.fetchBygetMiicById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					MiicApplicantDetails miicApplicantDetails = list.get(0);

					result = miicApplicantDetails;

					cacheResult(miicApplicantDetails);
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
			return (MiicApplicantDetails)result;
		}
	}

	/**
	 * Removes the miic applicant details where miicApplicationId = &#63; from the database.
	 *
	 * @param miicApplicationId the miic application ID
	 * @return the miic applicant details that was removed
	 */
	@Override
	public MiicApplicantDetails removeBygetMiicById(long miicApplicationId)
		throws NoSuchMiicApplicantDetailsException {

		MiicApplicantDetails miicApplicantDetails = findBygetMiicById(
			miicApplicationId);

		return remove(miicApplicantDetails);
	}

	/**
	 * Returns the number of miic applicant detailses where miicApplicationId = &#63;.
	 *
	 * @param miicApplicationId the miic application ID
	 * @return the number of matching miic applicant detailses
	 */
	@Override
	public int countBygetMiicById(long miicApplicationId) {
		FinderPath finderPath = _finderPathCountBygetMiicById;

		Object[] finderArgs = new Object[] {miicApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MIICAPPLICANTDETAILS_WHERE);

			sb.append(_FINDER_COLUMN_GETMIICBYID_MIICAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(miicApplicationId);

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

	private static final String _FINDER_COLUMN_GETMIICBYID_MIICAPPLICATIONID_2 =
		"miicApplicantDetails.miicApplicationId = ?";

	public MiicApplicantDetailsPersistenceImpl() {
		setModelClass(MiicApplicantDetails.class);

		setModelImplClass(MiicApplicantDetailsImpl.class);
		setModelPKClass(long.class);

		setTable(MiicApplicantDetailsTable.INSTANCE);
	}

	/**
	 * Caches the miic applicant details in the entity cache if it is enabled.
	 *
	 * @param miicApplicantDetails the miic applicant details
	 */
	@Override
	public void cacheResult(MiicApplicantDetails miicApplicantDetails) {
		entityCache.putResult(
			MiicApplicantDetailsImpl.class,
			miicApplicantDetails.getPrimaryKey(), miicApplicantDetails);

		finderCache.putResult(
			_finderPathFetchBygetMiicById,
			new Object[] {miicApplicantDetails.getMiicApplicationId()},
			miicApplicantDetails);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the miic applicant detailses in the entity cache if it is enabled.
	 *
	 * @param miicApplicantDetailses the miic applicant detailses
	 */
	@Override
	public void cacheResult(List<MiicApplicantDetails> miicApplicantDetailses) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (miicApplicantDetailses.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (MiicApplicantDetails miicApplicantDetails :
				miicApplicantDetailses) {

			if (entityCache.getResult(
					MiicApplicantDetailsImpl.class,
					miicApplicantDetails.getPrimaryKey()) == null) {

				cacheResult(miicApplicantDetails);
			}
		}
	}

	/**
	 * Clears the cache for all miic applicant detailses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(MiicApplicantDetailsImpl.class);

		finderCache.clearCache(MiicApplicantDetailsImpl.class);
	}

	/**
	 * Clears the cache for the miic applicant details.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(MiicApplicantDetails miicApplicantDetails) {
		entityCache.removeResult(
			MiicApplicantDetailsImpl.class, miicApplicantDetails);
	}

	@Override
	public void clearCache(List<MiicApplicantDetails> miicApplicantDetailses) {
		for (MiicApplicantDetails miicApplicantDetails :
				miicApplicantDetailses) {

			entityCache.removeResult(
				MiicApplicantDetailsImpl.class, miicApplicantDetails);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(MiicApplicantDetailsImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				MiicApplicantDetailsImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		MiicApplicantDetailsModelImpl miicApplicantDetailsModelImpl) {

		Object[] args = new Object[] {
			miicApplicantDetailsModelImpl.getMiicApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetMiicById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetMiicById, args, miicApplicantDetailsModelImpl);
	}

	/**
	 * Creates a new miic applicant details with the primary key. Does not add the miic applicant details to the database.
	 *
	 * @param miicApplicantDetailsId the primary key for the new miic applicant details
	 * @return the new miic applicant details
	 */
	@Override
	public MiicApplicantDetails create(long miicApplicantDetailsId) {
		MiicApplicantDetails miicApplicantDetails =
			new MiicApplicantDetailsImpl();

		miicApplicantDetails.setNew(true);
		miicApplicantDetails.setPrimaryKey(miicApplicantDetailsId);

		miicApplicantDetails.setCompanyId(CompanyThreadLocal.getCompanyId());

		return miicApplicantDetails;
	}

	/**
	 * Removes the miic applicant details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param miicApplicantDetailsId the primary key of the miic applicant details
	 * @return the miic applicant details that was removed
	 * @throws NoSuchMiicApplicantDetailsException if a miic applicant details with the primary key could not be found
	 */
	@Override
	public MiicApplicantDetails remove(long miicApplicantDetailsId)
		throws NoSuchMiicApplicantDetailsException {

		return remove((Serializable)miicApplicantDetailsId);
	}

	/**
	 * Removes the miic applicant details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the miic applicant details
	 * @return the miic applicant details that was removed
	 * @throws NoSuchMiicApplicantDetailsException if a miic applicant details with the primary key could not be found
	 */
	@Override
	public MiicApplicantDetails remove(Serializable primaryKey)
		throws NoSuchMiicApplicantDetailsException {

		Session session = null;

		try {
			session = openSession();

			MiicApplicantDetails miicApplicantDetails =
				(MiicApplicantDetails)session.get(
					MiicApplicantDetailsImpl.class, primaryKey);

			if (miicApplicantDetails == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchMiicApplicantDetailsException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(miicApplicantDetails);
		}
		catch (NoSuchMiicApplicantDetailsException noSuchEntityException) {
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
	protected MiicApplicantDetails removeImpl(
		MiicApplicantDetails miicApplicantDetails) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(miicApplicantDetails)) {
				miicApplicantDetails = (MiicApplicantDetails)session.get(
					MiicApplicantDetailsImpl.class,
					miicApplicantDetails.getPrimaryKeyObj());
			}

			if (miicApplicantDetails != null) {
				session.delete(miicApplicantDetails);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (miicApplicantDetails != null) {
			clearCache(miicApplicantDetails);
		}

		return miicApplicantDetails;
	}

	@Override
	public MiicApplicantDetails updateImpl(
		MiicApplicantDetails miicApplicantDetails) {

		boolean isNew = miicApplicantDetails.isNew();

		if (!(miicApplicantDetails instanceof MiicApplicantDetailsModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(miicApplicantDetails.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					miicApplicantDetails);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in miicApplicantDetails proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom MiicApplicantDetails implementation " +
					miicApplicantDetails.getClass());
		}

		MiicApplicantDetailsModelImpl miicApplicantDetailsModelImpl =
			(MiicApplicantDetailsModelImpl)miicApplicantDetails;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (miicApplicantDetails.getCreateDate() == null)) {
			if (serviceContext == null) {
				miicApplicantDetails.setCreateDate(date);
			}
			else {
				miicApplicantDetails.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!miicApplicantDetailsModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				miicApplicantDetails.setModifiedDate(date);
			}
			else {
				miicApplicantDetails.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(miicApplicantDetails);
			}
			else {
				miicApplicantDetails = (MiicApplicantDetails)session.merge(
					miicApplicantDetails);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			MiicApplicantDetailsImpl.class, miicApplicantDetailsModelImpl,
			false, true);

		cacheUniqueFindersCache(miicApplicantDetailsModelImpl);

		if (isNew) {
			miicApplicantDetails.setNew(false);
		}

		miicApplicantDetails.resetOriginalValues();

		return miicApplicantDetails;
	}

	/**
	 * Returns the miic applicant details with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the miic applicant details
	 * @return the miic applicant details
	 * @throws NoSuchMiicApplicantDetailsException if a miic applicant details with the primary key could not be found
	 */
	@Override
	public MiicApplicantDetails findByPrimaryKey(Serializable primaryKey)
		throws NoSuchMiicApplicantDetailsException {

		MiicApplicantDetails miicApplicantDetails = fetchByPrimaryKey(
			primaryKey);

		if (miicApplicantDetails == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchMiicApplicantDetailsException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return miicApplicantDetails;
	}

	/**
	 * Returns the miic applicant details with the primary key or throws a <code>NoSuchMiicApplicantDetailsException</code> if it could not be found.
	 *
	 * @param miicApplicantDetailsId the primary key of the miic applicant details
	 * @return the miic applicant details
	 * @throws NoSuchMiicApplicantDetailsException if a miic applicant details with the primary key could not be found
	 */
	@Override
	public MiicApplicantDetails findByPrimaryKey(long miicApplicantDetailsId)
		throws NoSuchMiicApplicantDetailsException {

		return findByPrimaryKey((Serializable)miicApplicantDetailsId);
	}

	/**
	 * Returns the miic applicant details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param miicApplicantDetailsId the primary key of the miic applicant details
	 * @return the miic applicant details, or <code>null</code> if a miic applicant details with the primary key could not be found
	 */
	@Override
	public MiicApplicantDetails fetchByPrimaryKey(long miicApplicantDetailsId) {
		return fetchByPrimaryKey((Serializable)miicApplicantDetailsId);
	}

	/**
	 * Returns all the miic applicant detailses.
	 *
	 * @return the miic applicant detailses
	 */
	@Override
	public List<MiicApplicantDetails> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the miic applicant detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicantDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic applicant detailses
	 * @param end the upper bound of the range of miic applicant detailses (not inclusive)
	 * @return the range of miic applicant detailses
	 */
	@Override
	public List<MiicApplicantDetails> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the miic applicant detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicantDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic applicant detailses
	 * @param end the upper bound of the range of miic applicant detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of miic applicant detailses
	 */
	@Override
	public List<MiicApplicantDetails> findAll(
		int start, int end,
		OrderByComparator<MiicApplicantDetails> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the miic applicant detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicantDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic applicant detailses
	 * @param end the upper bound of the range of miic applicant detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of miic applicant detailses
	 */
	@Override
	public List<MiicApplicantDetails> findAll(
		int start, int end,
		OrderByComparator<MiicApplicantDetails> orderByComparator,
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

		List<MiicApplicantDetails> list = null;

		if (useFinderCache) {
			list = (List<MiicApplicantDetails>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_MIICAPPLICANTDETAILS);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_MIICAPPLICANTDETAILS;

				sql = sql.concat(MiicApplicantDetailsModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<MiicApplicantDetails>)QueryUtil.list(
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
	 * Removes all the miic applicant detailses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (MiicApplicantDetails miicApplicantDetails : findAll()) {
			remove(miicApplicantDetails);
		}
	}

	/**
	 * Returns the number of miic applicant detailses.
	 *
	 * @return the number of miic applicant detailses
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
					_SQL_COUNT_MIICAPPLICANTDETAILS);

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
		return "miicApplicantDetailsId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_MIICAPPLICANTDETAILS;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return MiicApplicantDetailsModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the miic applicant details persistence.
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

		_finderPathFetchBygetMiicById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetMiicById",
			new String[] {Long.class.getName()},
			new String[] {"miicApplicationId"}, true);

		_finderPathCountBygetMiicById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetMiicById",
			new String[] {Long.class.getName()},
			new String[] {"miicApplicationId"}, false);

		MiicApplicantDetailsUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		MiicApplicantDetailsUtil.setPersistence(null);

		entityCache.removeCache(MiicApplicantDetailsImpl.class.getName());
	}

	@Override
	@Reference(
		target = MIIC_SERVICESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = MIIC_SERVICESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = MIIC_SERVICESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_MIICAPPLICANTDETAILS =
		"SELECT miicApplicantDetails FROM MiicApplicantDetails miicApplicantDetails";

	private static final String _SQL_SELECT_MIICAPPLICANTDETAILS_WHERE =
		"SELECT miicApplicantDetails FROM MiicApplicantDetails miicApplicantDetails WHERE ";

	private static final String _SQL_COUNT_MIICAPPLICANTDETAILS =
		"SELECT COUNT(miicApplicantDetails) FROM MiicApplicantDetails miicApplicantDetails";

	private static final String _SQL_COUNT_MIICAPPLICANTDETAILS_WHERE =
		"SELECT COUNT(miicApplicantDetails) FROM MiicApplicantDetails miicApplicantDetails WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"miicApplicantDetails.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No MiicApplicantDetails exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No MiicApplicantDetails exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		MiicApplicantDetailsPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}