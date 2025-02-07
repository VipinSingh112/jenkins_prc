/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ogt.application.form.services.service.persistence.impl;

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

import com.nbp.ogt.application.form.services.exception.NoSuchOgtClaimantDetailException;
import com.nbp.ogt.application.form.services.model.OgtClaimantDetail;
import com.nbp.ogt.application.form.services.model.OgtClaimantDetailTable;
import com.nbp.ogt.application.form.services.model.impl.OgtClaimantDetailImpl;
import com.nbp.ogt.application.form.services.model.impl.OgtClaimantDetailModelImpl;
import com.nbp.ogt.application.form.services.service.persistence.OgtClaimantDetailPersistence;
import com.nbp.ogt.application.form.services.service.persistence.OgtClaimantDetailUtil;
import com.nbp.ogt.application.form.services.service.persistence.impl.constants.OGT_APPLICATION_FORMPersistenceConstants;

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
 * The persistence implementation for the ogt claimant detail service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = OgtClaimantDetailPersistence.class)
public class OgtClaimantDetailPersistenceImpl
	extends BasePersistenceImpl<OgtClaimantDetail>
	implements OgtClaimantDetailPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>OgtClaimantDetailUtil</code> to access the ogt claimant detail persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		OgtClaimantDetailImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetOgtById;
	private FinderPath _finderPathCountBygetOgtById;

	/**
	 * Returns the ogt claimant detail where ogtApplicationId = &#63; or throws a <code>NoSuchOgtClaimantDetailException</code> if it could not be found.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @return the matching ogt claimant detail
	 * @throws NoSuchOgtClaimantDetailException if a matching ogt claimant detail could not be found
	 */
	@Override
	public OgtClaimantDetail findBygetOgtById(long ogtApplicationId)
		throws NoSuchOgtClaimantDetailException {

		OgtClaimantDetail ogtClaimantDetail = fetchBygetOgtById(
			ogtApplicationId);

		if (ogtClaimantDetail == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("ogtApplicationId=");
			sb.append(ogtApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchOgtClaimantDetailException(sb.toString());
		}

		return ogtClaimantDetail;
	}

	/**
	 * Returns the ogt claimant detail where ogtApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @return the matching ogt claimant detail, or <code>null</code> if a matching ogt claimant detail could not be found
	 */
	@Override
	public OgtClaimantDetail fetchBygetOgtById(long ogtApplicationId) {
		return fetchBygetOgtById(ogtApplicationId, true);
	}

	/**
	 * Returns the ogt claimant detail where ogtApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ogt claimant detail, or <code>null</code> if a matching ogt claimant detail could not be found
	 */
	@Override
	public OgtClaimantDetail fetchBygetOgtById(
		long ogtApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {ogtApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetOgtById, finderArgs, this);
		}

		if (result instanceof OgtClaimantDetail) {
			OgtClaimantDetail ogtClaimantDetail = (OgtClaimantDetail)result;

			if (ogtApplicationId != ogtClaimantDetail.getOgtApplicationId()) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_OGTCLAIMANTDETAIL_WHERE);

			sb.append(_FINDER_COLUMN_GETOGTBYID_OGTAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(ogtApplicationId);

				List<OgtClaimantDetail> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetOgtById, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {ogtApplicationId};
							}

							_log.warn(
								"OgtClaimantDetailPersistenceImpl.fetchBygetOgtById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					OgtClaimantDetail ogtClaimantDetail = list.get(0);

					result = ogtClaimantDetail;

					cacheResult(ogtClaimantDetail);
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
			return (OgtClaimantDetail)result;
		}
	}

	/**
	 * Removes the ogt claimant detail where ogtApplicationId = &#63; from the database.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @return the ogt claimant detail that was removed
	 */
	@Override
	public OgtClaimantDetail removeBygetOgtById(long ogtApplicationId)
		throws NoSuchOgtClaimantDetailException {

		OgtClaimantDetail ogtClaimantDetail = findBygetOgtById(
			ogtApplicationId);

		return remove(ogtClaimantDetail);
	}

	/**
	 * Returns the number of ogt claimant details where ogtApplicationId = &#63;.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @return the number of matching ogt claimant details
	 */
	@Override
	public int countBygetOgtById(long ogtApplicationId) {
		FinderPath finderPath = _finderPathCountBygetOgtById;

		Object[] finderArgs = new Object[] {ogtApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_OGTCLAIMANTDETAIL_WHERE);

			sb.append(_FINDER_COLUMN_GETOGTBYID_OGTAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(ogtApplicationId);

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

	private static final String _FINDER_COLUMN_GETOGTBYID_OGTAPPLICATIONID_2 =
		"ogtClaimantDetail.ogtApplicationId = ?";

	public OgtClaimantDetailPersistenceImpl() {
		setModelClass(OgtClaimantDetail.class);

		setModelImplClass(OgtClaimantDetailImpl.class);
		setModelPKClass(long.class);

		setTable(OgtClaimantDetailTable.INSTANCE);
	}

	/**
	 * Caches the ogt claimant detail in the entity cache if it is enabled.
	 *
	 * @param ogtClaimantDetail the ogt claimant detail
	 */
	@Override
	public void cacheResult(OgtClaimantDetail ogtClaimantDetail) {
		entityCache.putResult(
			OgtClaimantDetailImpl.class, ogtClaimantDetail.getPrimaryKey(),
			ogtClaimantDetail);

		finderCache.putResult(
			_finderPathFetchBygetOgtById,
			new Object[] {ogtClaimantDetail.getOgtApplicationId()},
			ogtClaimantDetail);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the ogt claimant details in the entity cache if it is enabled.
	 *
	 * @param ogtClaimantDetails the ogt claimant details
	 */
	@Override
	public void cacheResult(List<OgtClaimantDetail> ogtClaimantDetails) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (ogtClaimantDetails.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (OgtClaimantDetail ogtClaimantDetail : ogtClaimantDetails) {
			if (entityCache.getResult(
					OgtClaimantDetailImpl.class,
					ogtClaimantDetail.getPrimaryKey()) == null) {

				cacheResult(ogtClaimantDetail);
			}
		}
	}

	/**
	 * Clears the cache for all ogt claimant details.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(OgtClaimantDetailImpl.class);

		finderCache.clearCache(OgtClaimantDetailImpl.class);
	}

	/**
	 * Clears the cache for the ogt claimant detail.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(OgtClaimantDetail ogtClaimantDetail) {
		entityCache.removeResult(
			OgtClaimantDetailImpl.class, ogtClaimantDetail);
	}

	@Override
	public void clearCache(List<OgtClaimantDetail> ogtClaimantDetails) {
		for (OgtClaimantDetail ogtClaimantDetail : ogtClaimantDetails) {
			entityCache.removeResult(
				OgtClaimantDetailImpl.class, ogtClaimantDetail);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(OgtClaimantDetailImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(OgtClaimantDetailImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		OgtClaimantDetailModelImpl ogtClaimantDetailModelImpl) {

		Object[] args = new Object[] {
			ogtClaimantDetailModelImpl.getOgtApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetOgtById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetOgtById, args, ogtClaimantDetailModelImpl);
	}

	/**
	 * Creates a new ogt claimant detail with the primary key. Does not add the ogt claimant detail to the database.
	 *
	 * @param ogtClaimantDetailId the primary key for the new ogt claimant detail
	 * @return the new ogt claimant detail
	 */
	@Override
	public OgtClaimantDetail create(long ogtClaimantDetailId) {
		OgtClaimantDetail ogtClaimantDetail = new OgtClaimantDetailImpl();

		ogtClaimantDetail.setNew(true);
		ogtClaimantDetail.setPrimaryKey(ogtClaimantDetailId);

		ogtClaimantDetail.setCompanyId(CompanyThreadLocal.getCompanyId());

		return ogtClaimantDetail;
	}

	/**
	 * Removes the ogt claimant detail with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ogtClaimantDetailId the primary key of the ogt claimant detail
	 * @return the ogt claimant detail that was removed
	 * @throws NoSuchOgtClaimantDetailException if a ogt claimant detail with the primary key could not be found
	 */
	@Override
	public OgtClaimantDetail remove(long ogtClaimantDetailId)
		throws NoSuchOgtClaimantDetailException {

		return remove((Serializable)ogtClaimantDetailId);
	}

	/**
	 * Removes the ogt claimant detail with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the ogt claimant detail
	 * @return the ogt claimant detail that was removed
	 * @throws NoSuchOgtClaimantDetailException if a ogt claimant detail with the primary key could not be found
	 */
	@Override
	public OgtClaimantDetail remove(Serializable primaryKey)
		throws NoSuchOgtClaimantDetailException {

		Session session = null;

		try {
			session = openSession();

			OgtClaimantDetail ogtClaimantDetail =
				(OgtClaimantDetail)session.get(
					OgtClaimantDetailImpl.class, primaryKey);

			if (ogtClaimantDetail == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchOgtClaimantDetailException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(ogtClaimantDetail);
		}
		catch (NoSuchOgtClaimantDetailException noSuchEntityException) {
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
	protected OgtClaimantDetail removeImpl(
		OgtClaimantDetail ogtClaimantDetail) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(ogtClaimantDetail)) {
				ogtClaimantDetail = (OgtClaimantDetail)session.get(
					OgtClaimantDetailImpl.class,
					ogtClaimantDetail.getPrimaryKeyObj());
			}

			if (ogtClaimantDetail != null) {
				session.delete(ogtClaimantDetail);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (ogtClaimantDetail != null) {
			clearCache(ogtClaimantDetail);
		}

		return ogtClaimantDetail;
	}

	@Override
	public OgtClaimantDetail updateImpl(OgtClaimantDetail ogtClaimantDetail) {
		boolean isNew = ogtClaimantDetail.isNew();

		if (!(ogtClaimantDetail instanceof OgtClaimantDetailModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(ogtClaimantDetail.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					ogtClaimantDetail);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in ogtClaimantDetail proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom OgtClaimantDetail implementation " +
					ogtClaimantDetail.getClass());
		}

		OgtClaimantDetailModelImpl ogtClaimantDetailModelImpl =
			(OgtClaimantDetailModelImpl)ogtClaimantDetail;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (ogtClaimantDetail.getCreateDate() == null)) {
			if (serviceContext == null) {
				ogtClaimantDetail.setCreateDate(date);
			}
			else {
				ogtClaimantDetail.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!ogtClaimantDetailModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				ogtClaimantDetail.setModifiedDate(date);
			}
			else {
				ogtClaimantDetail.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(ogtClaimantDetail);
			}
			else {
				ogtClaimantDetail = (OgtClaimantDetail)session.merge(
					ogtClaimantDetail);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			OgtClaimantDetailImpl.class, ogtClaimantDetailModelImpl, false,
			true);

		cacheUniqueFindersCache(ogtClaimantDetailModelImpl);

		if (isNew) {
			ogtClaimantDetail.setNew(false);
		}

		ogtClaimantDetail.resetOriginalValues();

		return ogtClaimantDetail;
	}

	/**
	 * Returns the ogt claimant detail with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the ogt claimant detail
	 * @return the ogt claimant detail
	 * @throws NoSuchOgtClaimantDetailException if a ogt claimant detail with the primary key could not be found
	 */
	@Override
	public OgtClaimantDetail findByPrimaryKey(Serializable primaryKey)
		throws NoSuchOgtClaimantDetailException {

		OgtClaimantDetail ogtClaimantDetail = fetchByPrimaryKey(primaryKey);

		if (ogtClaimantDetail == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchOgtClaimantDetailException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return ogtClaimantDetail;
	}

	/**
	 * Returns the ogt claimant detail with the primary key or throws a <code>NoSuchOgtClaimantDetailException</code> if it could not be found.
	 *
	 * @param ogtClaimantDetailId the primary key of the ogt claimant detail
	 * @return the ogt claimant detail
	 * @throws NoSuchOgtClaimantDetailException if a ogt claimant detail with the primary key could not be found
	 */
	@Override
	public OgtClaimantDetail findByPrimaryKey(long ogtClaimantDetailId)
		throws NoSuchOgtClaimantDetailException {

		return findByPrimaryKey((Serializable)ogtClaimantDetailId);
	}

	/**
	 * Returns the ogt claimant detail with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ogtClaimantDetailId the primary key of the ogt claimant detail
	 * @return the ogt claimant detail, or <code>null</code> if a ogt claimant detail with the primary key could not be found
	 */
	@Override
	public OgtClaimantDetail fetchByPrimaryKey(long ogtClaimantDetailId) {
		return fetchByPrimaryKey((Serializable)ogtClaimantDetailId);
	}

	/**
	 * Returns all the ogt claimant details.
	 *
	 * @return the ogt claimant details
	 */
	@Override
	public List<OgtClaimantDetail> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ogt claimant details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtClaimantDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ogt claimant details
	 * @param end the upper bound of the range of ogt claimant details (not inclusive)
	 * @return the range of ogt claimant details
	 */
	@Override
	public List<OgtClaimantDetail> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the ogt claimant details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtClaimantDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ogt claimant details
	 * @param end the upper bound of the range of ogt claimant details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ogt claimant details
	 */
	@Override
	public List<OgtClaimantDetail> findAll(
		int start, int end,
		OrderByComparator<OgtClaimantDetail> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ogt claimant details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtClaimantDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ogt claimant details
	 * @param end the upper bound of the range of ogt claimant details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ogt claimant details
	 */
	@Override
	public List<OgtClaimantDetail> findAll(
		int start, int end,
		OrderByComparator<OgtClaimantDetail> orderByComparator,
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

		List<OgtClaimantDetail> list = null;

		if (useFinderCache) {
			list = (List<OgtClaimantDetail>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_OGTCLAIMANTDETAIL);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_OGTCLAIMANTDETAIL;

				sql = sql.concat(OgtClaimantDetailModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<OgtClaimantDetail>)QueryUtil.list(
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
	 * Removes all the ogt claimant details from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (OgtClaimantDetail ogtClaimantDetail : findAll()) {
			remove(ogtClaimantDetail);
		}
	}

	/**
	 * Returns the number of ogt claimant details.
	 *
	 * @return the number of ogt claimant details
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_OGTCLAIMANTDETAIL);

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
		return "ogtClaimantDetailId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_OGTCLAIMANTDETAIL;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return OgtClaimantDetailModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the ogt claimant detail persistence.
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

		_finderPathFetchBygetOgtById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetOgtById",
			new String[] {Long.class.getName()},
			new String[] {"ogtApplicationId"}, true);

		_finderPathCountBygetOgtById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetOgtById",
			new String[] {Long.class.getName()},
			new String[] {"ogtApplicationId"}, false);

		OgtClaimantDetailUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		OgtClaimantDetailUtil.setPersistence(null);

		entityCache.removeCache(OgtClaimantDetailImpl.class.getName());
	}

	@Override
	@Reference(
		target = OGT_APPLICATION_FORMPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = OGT_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = OGT_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_OGTCLAIMANTDETAIL =
		"SELECT ogtClaimantDetail FROM OgtClaimantDetail ogtClaimantDetail";

	private static final String _SQL_SELECT_OGTCLAIMANTDETAIL_WHERE =
		"SELECT ogtClaimantDetail FROM OgtClaimantDetail ogtClaimantDetail WHERE ";

	private static final String _SQL_COUNT_OGTCLAIMANTDETAIL =
		"SELECT COUNT(ogtClaimantDetail) FROM OgtClaimantDetail ogtClaimantDetail";

	private static final String _SQL_COUNT_OGTCLAIMANTDETAIL_WHERE =
		"SELECT COUNT(ogtClaimantDetail) FROM OgtClaimantDetail ogtClaimantDetail WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "ogtClaimantDetail.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No OgtClaimantDetail exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No OgtClaimantDetail exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		OgtClaimantDetailPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}