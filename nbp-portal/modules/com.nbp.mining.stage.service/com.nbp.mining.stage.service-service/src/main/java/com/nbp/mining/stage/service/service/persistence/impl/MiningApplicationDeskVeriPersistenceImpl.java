/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.stage.service.service.persistence.impl;

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

import com.nbp.mining.stage.service.exception.NoSuchMiningApplicationDeskVeriException;
import com.nbp.mining.stage.service.model.MiningApplicationDeskVeri;
import com.nbp.mining.stage.service.model.MiningApplicationDeskVeriTable;
import com.nbp.mining.stage.service.model.impl.MiningApplicationDeskVeriImpl;
import com.nbp.mining.stage.service.model.impl.MiningApplicationDeskVeriModelImpl;
import com.nbp.mining.stage.service.service.persistence.MiningApplicationDeskVeriPersistence;
import com.nbp.mining.stage.service.service.persistence.MiningApplicationDeskVeriUtil;
import com.nbp.mining.stage.service.service.persistence.impl.constants.MINING_STAGESPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

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
 * The persistence implementation for the mining application desk veri service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = MiningApplicationDeskVeriPersistence.class)
public class MiningApplicationDeskVeriPersistenceImpl
	extends BasePersistenceImpl<MiningApplicationDeskVeri>
	implements MiningApplicationDeskVeriPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>MiningApplicationDeskVeriUtil</code> to access the mining application desk veri persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		MiningApplicationDeskVeriImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindBygetMiningAppDV_ById;
	private FinderPath _finderPathWithoutPaginationFindBygetMiningAppDV_ById;
	private FinderPath _finderPathCountBygetMiningAppDV_ById;

	/**
	 * Returns all the mining application desk veris where miningApplicationId = &#63;.
	 *
	 * @param miningApplicationId the mining application ID
	 * @return the matching mining application desk veris
	 */
	@Override
	public List<MiningApplicationDeskVeri> findBygetMiningAppDV_ById(
		long miningApplicationId) {

		return findBygetMiningAppDV_ById(
			miningApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mining application desk veris where miningApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param miningApplicationId the mining application ID
	 * @param start the lower bound of the range of mining application desk veris
	 * @param end the upper bound of the range of mining application desk veris (not inclusive)
	 * @return the range of matching mining application desk veris
	 */
	@Override
	public List<MiningApplicationDeskVeri> findBygetMiningAppDV_ById(
		long miningApplicationId, int start, int end) {

		return findBygetMiningAppDV_ById(miningApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the mining application desk veris where miningApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param miningApplicationId the mining application ID
	 * @param start the lower bound of the range of mining application desk veris
	 * @param end the upper bound of the range of mining application desk veris (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mining application desk veris
	 */
	@Override
	public List<MiningApplicationDeskVeri> findBygetMiningAppDV_ById(
		long miningApplicationId, int start, int end,
		OrderByComparator<MiningApplicationDeskVeri> orderByComparator) {

		return findBygetMiningAppDV_ById(
			miningApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the mining application desk veris where miningApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param miningApplicationId the mining application ID
	 * @param start the lower bound of the range of mining application desk veris
	 * @param end the upper bound of the range of mining application desk veris (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching mining application desk veris
	 */
	@Override
	public List<MiningApplicationDeskVeri> findBygetMiningAppDV_ById(
		long miningApplicationId, int start, int end,
		OrderByComparator<MiningApplicationDeskVeri> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetMiningAppDV_ById;
				finderArgs = new Object[] {miningApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetMiningAppDV_ById;
			finderArgs = new Object[] {
				miningApplicationId, start, end, orderByComparator
			};
		}

		List<MiningApplicationDeskVeri> list = null;

		if (useFinderCache) {
			list = (List<MiningApplicationDeskVeri>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (MiningApplicationDeskVeri miningApplicationDeskVeri :
						list) {

					if (miningApplicationId !=
							miningApplicationDeskVeri.
								getMiningApplicationId()) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_MININGAPPLICATIONDESKVERI_WHERE);

			sb.append(_FINDER_COLUMN_GETMININGAPPDV_BYID_MININGAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(MiningApplicationDeskVeriModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(miningApplicationId);

				list = (List<MiningApplicationDeskVeri>)QueryUtil.list(
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
	 * Returns the first mining application desk veri in the ordered set where miningApplicationId = &#63;.
	 *
	 * @param miningApplicationId the mining application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining application desk veri
	 * @throws NoSuchMiningApplicationDeskVeriException if a matching mining application desk veri could not be found
	 */
	@Override
	public MiningApplicationDeskVeri findBygetMiningAppDV_ById_First(
			long miningApplicationId,
			OrderByComparator<MiningApplicationDeskVeri> orderByComparator)
		throws NoSuchMiningApplicationDeskVeriException {

		MiningApplicationDeskVeri miningApplicationDeskVeri =
			fetchBygetMiningAppDV_ById_First(
				miningApplicationId, orderByComparator);

		if (miningApplicationDeskVeri != null) {
			return miningApplicationDeskVeri;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("miningApplicationId=");
		sb.append(miningApplicationId);

		sb.append("}");

		throw new NoSuchMiningApplicationDeskVeriException(sb.toString());
	}

	/**
	 * Returns the first mining application desk veri in the ordered set where miningApplicationId = &#63;.
	 *
	 * @param miningApplicationId the mining application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining application desk veri, or <code>null</code> if a matching mining application desk veri could not be found
	 */
	@Override
	public MiningApplicationDeskVeri fetchBygetMiningAppDV_ById_First(
		long miningApplicationId,
		OrderByComparator<MiningApplicationDeskVeri> orderByComparator) {

		List<MiningApplicationDeskVeri> list = findBygetMiningAppDV_ById(
			miningApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last mining application desk veri in the ordered set where miningApplicationId = &#63;.
	 *
	 * @param miningApplicationId the mining application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining application desk veri
	 * @throws NoSuchMiningApplicationDeskVeriException if a matching mining application desk veri could not be found
	 */
	@Override
	public MiningApplicationDeskVeri findBygetMiningAppDV_ById_Last(
			long miningApplicationId,
			OrderByComparator<MiningApplicationDeskVeri> orderByComparator)
		throws NoSuchMiningApplicationDeskVeriException {

		MiningApplicationDeskVeri miningApplicationDeskVeri =
			fetchBygetMiningAppDV_ById_Last(
				miningApplicationId, orderByComparator);

		if (miningApplicationDeskVeri != null) {
			return miningApplicationDeskVeri;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("miningApplicationId=");
		sb.append(miningApplicationId);

		sb.append("}");

		throw new NoSuchMiningApplicationDeskVeriException(sb.toString());
	}

	/**
	 * Returns the last mining application desk veri in the ordered set where miningApplicationId = &#63;.
	 *
	 * @param miningApplicationId the mining application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining application desk veri, or <code>null</code> if a matching mining application desk veri could not be found
	 */
	@Override
	public MiningApplicationDeskVeri fetchBygetMiningAppDV_ById_Last(
		long miningApplicationId,
		OrderByComparator<MiningApplicationDeskVeri> orderByComparator) {

		int count = countBygetMiningAppDV_ById(miningApplicationId);

		if (count == 0) {
			return null;
		}

		List<MiningApplicationDeskVeri> list = findBygetMiningAppDV_ById(
			miningApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the mining application desk veris before and after the current mining application desk veri in the ordered set where miningApplicationId = &#63;.
	 *
	 * @param miningDeskVeriId the primary key of the current mining application desk veri
	 * @param miningApplicationId the mining application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mining application desk veri
	 * @throws NoSuchMiningApplicationDeskVeriException if a mining application desk veri with the primary key could not be found
	 */
	@Override
	public MiningApplicationDeskVeri[] findBygetMiningAppDV_ById_PrevAndNext(
			long miningDeskVeriId, long miningApplicationId,
			OrderByComparator<MiningApplicationDeskVeri> orderByComparator)
		throws NoSuchMiningApplicationDeskVeriException {

		MiningApplicationDeskVeri miningApplicationDeskVeri = findByPrimaryKey(
			miningDeskVeriId);

		Session session = null;

		try {
			session = openSession();

			MiningApplicationDeskVeri[] array =
				new MiningApplicationDeskVeriImpl[3];

			array[0] = getBygetMiningAppDV_ById_PrevAndNext(
				session, miningApplicationDeskVeri, miningApplicationId,
				orderByComparator, true);

			array[1] = miningApplicationDeskVeri;

			array[2] = getBygetMiningAppDV_ById_PrevAndNext(
				session, miningApplicationDeskVeri, miningApplicationId,
				orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected MiningApplicationDeskVeri getBygetMiningAppDV_ById_PrevAndNext(
		Session session, MiningApplicationDeskVeri miningApplicationDeskVeri,
		long miningApplicationId,
		OrderByComparator<MiningApplicationDeskVeri> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_MININGAPPLICATIONDESKVERI_WHERE);

		sb.append(_FINDER_COLUMN_GETMININGAPPDV_BYID_MININGAPPLICATIONID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(MiningApplicationDeskVeriModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(miningApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						miningApplicationDeskVeri)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<MiningApplicationDeskVeri> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the mining application desk veris where miningApplicationId = &#63; from the database.
	 *
	 * @param miningApplicationId the mining application ID
	 */
	@Override
	public void removeBygetMiningAppDV_ById(long miningApplicationId) {
		for (MiningApplicationDeskVeri miningApplicationDeskVeri :
				findBygetMiningAppDV_ById(
					miningApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(miningApplicationDeskVeri);
		}
	}

	/**
	 * Returns the number of mining application desk veris where miningApplicationId = &#63;.
	 *
	 * @param miningApplicationId the mining application ID
	 * @return the number of matching mining application desk veris
	 */
	@Override
	public int countBygetMiningAppDV_ById(long miningApplicationId) {
		FinderPath finderPath = _finderPathCountBygetMiningAppDV_ById;

		Object[] finderArgs = new Object[] {miningApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MININGAPPLICATIONDESKVERI_WHERE);

			sb.append(_FINDER_COLUMN_GETMININGAPPDV_BYID_MININGAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(miningApplicationId);

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
		_FINDER_COLUMN_GETMININGAPPDV_BYID_MININGAPPLICATIONID_2 =
			"miningApplicationDeskVeri.miningApplicationId = ?";

	public MiningApplicationDeskVeriPersistenceImpl() {
		setModelClass(MiningApplicationDeskVeri.class);

		setModelImplClass(MiningApplicationDeskVeriImpl.class);
		setModelPKClass(long.class);

		setTable(MiningApplicationDeskVeriTable.INSTANCE);
	}

	/**
	 * Caches the mining application desk veri in the entity cache if it is enabled.
	 *
	 * @param miningApplicationDeskVeri the mining application desk veri
	 */
	@Override
	public void cacheResult(
		MiningApplicationDeskVeri miningApplicationDeskVeri) {

		entityCache.putResult(
			MiningApplicationDeskVeriImpl.class,
			miningApplicationDeskVeri.getPrimaryKey(),
			miningApplicationDeskVeri);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the mining application desk veris in the entity cache if it is enabled.
	 *
	 * @param miningApplicationDeskVeris the mining application desk veris
	 */
	@Override
	public void cacheResult(
		List<MiningApplicationDeskVeri> miningApplicationDeskVeris) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (miningApplicationDeskVeris.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (MiningApplicationDeskVeri miningApplicationDeskVeri :
				miningApplicationDeskVeris) {

			if (entityCache.getResult(
					MiningApplicationDeskVeriImpl.class,
					miningApplicationDeskVeri.getPrimaryKey()) == null) {

				cacheResult(miningApplicationDeskVeri);
			}
		}
	}

	/**
	 * Clears the cache for all mining application desk veris.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(MiningApplicationDeskVeriImpl.class);

		finderCache.clearCache(MiningApplicationDeskVeriImpl.class);
	}

	/**
	 * Clears the cache for the mining application desk veri.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		MiningApplicationDeskVeri miningApplicationDeskVeri) {

		entityCache.removeResult(
			MiningApplicationDeskVeriImpl.class, miningApplicationDeskVeri);
	}

	@Override
	public void clearCache(
		List<MiningApplicationDeskVeri> miningApplicationDeskVeris) {

		for (MiningApplicationDeskVeri miningApplicationDeskVeri :
				miningApplicationDeskVeris) {

			entityCache.removeResult(
				MiningApplicationDeskVeriImpl.class, miningApplicationDeskVeri);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(MiningApplicationDeskVeriImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				MiningApplicationDeskVeriImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new mining application desk veri with the primary key. Does not add the mining application desk veri to the database.
	 *
	 * @param miningDeskVeriId the primary key for the new mining application desk veri
	 * @return the new mining application desk veri
	 */
	@Override
	public MiningApplicationDeskVeri create(long miningDeskVeriId) {
		MiningApplicationDeskVeri miningApplicationDeskVeri =
			new MiningApplicationDeskVeriImpl();

		miningApplicationDeskVeri.setNew(true);
		miningApplicationDeskVeri.setPrimaryKey(miningDeskVeriId);

		miningApplicationDeskVeri.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return miningApplicationDeskVeri;
	}

	/**
	 * Removes the mining application desk veri with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param miningDeskVeriId the primary key of the mining application desk veri
	 * @return the mining application desk veri that was removed
	 * @throws NoSuchMiningApplicationDeskVeriException if a mining application desk veri with the primary key could not be found
	 */
	@Override
	public MiningApplicationDeskVeri remove(long miningDeskVeriId)
		throws NoSuchMiningApplicationDeskVeriException {

		return remove((Serializable)miningDeskVeriId);
	}

	/**
	 * Removes the mining application desk veri with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the mining application desk veri
	 * @return the mining application desk veri that was removed
	 * @throws NoSuchMiningApplicationDeskVeriException if a mining application desk veri with the primary key could not be found
	 */
	@Override
	public MiningApplicationDeskVeri remove(Serializable primaryKey)
		throws NoSuchMiningApplicationDeskVeriException {

		Session session = null;

		try {
			session = openSession();

			MiningApplicationDeskVeri miningApplicationDeskVeri =
				(MiningApplicationDeskVeri)session.get(
					MiningApplicationDeskVeriImpl.class, primaryKey);

			if (miningApplicationDeskVeri == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchMiningApplicationDeskVeriException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(miningApplicationDeskVeri);
		}
		catch (NoSuchMiningApplicationDeskVeriException noSuchEntityException) {
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
	protected MiningApplicationDeskVeri removeImpl(
		MiningApplicationDeskVeri miningApplicationDeskVeri) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(miningApplicationDeskVeri)) {
				miningApplicationDeskVeri =
					(MiningApplicationDeskVeri)session.get(
						MiningApplicationDeskVeriImpl.class,
						miningApplicationDeskVeri.getPrimaryKeyObj());
			}

			if (miningApplicationDeskVeri != null) {
				session.delete(miningApplicationDeskVeri);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (miningApplicationDeskVeri != null) {
			clearCache(miningApplicationDeskVeri);
		}

		return miningApplicationDeskVeri;
	}

	@Override
	public MiningApplicationDeskVeri updateImpl(
		MiningApplicationDeskVeri miningApplicationDeskVeri) {

		boolean isNew = miningApplicationDeskVeri.isNew();

		if (!(miningApplicationDeskVeri instanceof
				MiningApplicationDeskVeriModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(miningApplicationDeskVeri.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					miningApplicationDeskVeri);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in miningApplicationDeskVeri proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom MiningApplicationDeskVeri implementation " +
					miningApplicationDeskVeri.getClass());
		}

		MiningApplicationDeskVeriModelImpl miningApplicationDeskVeriModelImpl =
			(MiningApplicationDeskVeriModelImpl)miningApplicationDeskVeri;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (miningApplicationDeskVeri.getCreateDate() == null)) {
			if (serviceContext == null) {
				miningApplicationDeskVeri.setCreateDate(date);
			}
			else {
				miningApplicationDeskVeri.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!miningApplicationDeskVeriModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				miningApplicationDeskVeri.setModifiedDate(date);
			}
			else {
				miningApplicationDeskVeri.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(miningApplicationDeskVeri);
			}
			else {
				miningApplicationDeskVeri =
					(MiningApplicationDeskVeri)session.merge(
						miningApplicationDeskVeri);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			MiningApplicationDeskVeriImpl.class,
			miningApplicationDeskVeriModelImpl, false, true);

		if (isNew) {
			miningApplicationDeskVeri.setNew(false);
		}

		miningApplicationDeskVeri.resetOriginalValues();

		return miningApplicationDeskVeri;
	}

	/**
	 * Returns the mining application desk veri with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the mining application desk veri
	 * @return the mining application desk veri
	 * @throws NoSuchMiningApplicationDeskVeriException if a mining application desk veri with the primary key could not be found
	 */
	@Override
	public MiningApplicationDeskVeri findByPrimaryKey(Serializable primaryKey)
		throws NoSuchMiningApplicationDeskVeriException {

		MiningApplicationDeskVeri miningApplicationDeskVeri = fetchByPrimaryKey(
			primaryKey);

		if (miningApplicationDeskVeri == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchMiningApplicationDeskVeriException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return miningApplicationDeskVeri;
	}

	/**
	 * Returns the mining application desk veri with the primary key or throws a <code>NoSuchMiningApplicationDeskVeriException</code> if it could not be found.
	 *
	 * @param miningDeskVeriId the primary key of the mining application desk veri
	 * @return the mining application desk veri
	 * @throws NoSuchMiningApplicationDeskVeriException if a mining application desk veri with the primary key could not be found
	 */
	@Override
	public MiningApplicationDeskVeri findByPrimaryKey(long miningDeskVeriId)
		throws NoSuchMiningApplicationDeskVeriException {

		return findByPrimaryKey((Serializable)miningDeskVeriId);
	}

	/**
	 * Returns the mining application desk veri with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param miningDeskVeriId the primary key of the mining application desk veri
	 * @return the mining application desk veri, or <code>null</code> if a mining application desk veri with the primary key could not be found
	 */
	@Override
	public MiningApplicationDeskVeri fetchByPrimaryKey(long miningDeskVeriId) {
		return fetchByPrimaryKey((Serializable)miningDeskVeriId);
	}

	/**
	 * Returns all the mining application desk veris.
	 *
	 * @return the mining application desk veris
	 */
	@Override
	public List<MiningApplicationDeskVeri> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mining application desk veris.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining application desk veris
	 * @param end the upper bound of the range of mining application desk veris (not inclusive)
	 * @return the range of mining application desk veris
	 */
	@Override
	public List<MiningApplicationDeskVeri> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the mining application desk veris.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining application desk veris
	 * @param end the upper bound of the range of mining application desk veris (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of mining application desk veris
	 */
	@Override
	public List<MiningApplicationDeskVeri> findAll(
		int start, int end,
		OrderByComparator<MiningApplicationDeskVeri> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the mining application desk veris.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining application desk veris
	 * @param end the upper bound of the range of mining application desk veris (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of mining application desk veris
	 */
	@Override
	public List<MiningApplicationDeskVeri> findAll(
		int start, int end,
		OrderByComparator<MiningApplicationDeskVeri> orderByComparator,
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

		List<MiningApplicationDeskVeri> list = null;

		if (useFinderCache) {
			list = (List<MiningApplicationDeskVeri>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_MININGAPPLICATIONDESKVERI);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_MININGAPPLICATIONDESKVERI;

				sql = sql.concat(
					MiningApplicationDeskVeriModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<MiningApplicationDeskVeri>)QueryUtil.list(
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
	 * Removes all the mining application desk veris from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (MiningApplicationDeskVeri miningApplicationDeskVeri : findAll()) {
			remove(miningApplicationDeskVeri);
		}
	}

	/**
	 * Returns the number of mining application desk veris.
	 *
	 * @return the number of mining application desk veris
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
					_SQL_COUNT_MININGAPPLICATIONDESKVERI);

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
		return "miningDeskVeriId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_MININGAPPLICATIONDESKVERI;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return MiningApplicationDeskVeriModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the mining application desk veri persistence.
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

		_finderPathWithPaginationFindBygetMiningAppDV_ById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetMiningAppDV_ById",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"miningApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetMiningAppDV_ById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBygetMiningAppDV_ById", new String[] {Long.class.getName()},
			new String[] {"miningApplicationId"}, true);

		_finderPathCountBygetMiningAppDV_ById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetMiningAppDV_ById", new String[] {Long.class.getName()},
			new String[] {"miningApplicationId"}, false);

		MiningApplicationDeskVeriUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		MiningApplicationDeskVeriUtil.setPersistence(null);

		entityCache.removeCache(MiningApplicationDeskVeriImpl.class.getName());
	}

	@Override
	@Reference(
		target = MINING_STAGESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = MINING_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = MINING_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_MININGAPPLICATIONDESKVERI =
		"SELECT miningApplicationDeskVeri FROM MiningApplicationDeskVeri miningApplicationDeskVeri";

	private static final String _SQL_SELECT_MININGAPPLICATIONDESKVERI_WHERE =
		"SELECT miningApplicationDeskVeri FROM MiningApplicationDeskVeri miningApplicationDeskVeri WHERE ";

	private static final String _SQL_COUNT_MININGAPPLICATIONDESKVERI =
		"SELECT COUNT(miningApplicationDeskVeri) FROM MiningApplicationDeskVeri miningApplicationDeskVeri";

	private static final String _SQL_COUNT_MININGAPPLICATIONDESKVERI_WHERE =
		"SELECT COUNT(miningApplicationDeskVeri) FROM MiningApplicationDeskVeri miningApplicationDeskVeri WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"miningApplicationDeskVeri.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No MiningApplicationDeskVeri exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No MiningApplicationDeskVeri exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		MiningApplicationDeskVeriPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}