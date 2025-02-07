/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence.impl;

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

import com.nbp.hsra.application.service.exception.NoSuchSourcesDetailAddException;
import com.nbp.hsra.application.service.model.SourcesDetailAdd;
import com.nbp.hsra.application.service.model.SourcesDetailAddTable;
import com.nbp.hsra.application.service.model.impl.SourcesDetailAddImpl;
import com.nbp.hsra.application.service.model.impl.SourcesDetailAddModelImpl;
import com.nbp.hsra.application.service.service.persistence.SourcesDetailAddPersistence;
import com.nbp.hsra.application.service.service.persistence.SourcesDetailAddUtil;
import com.nbp.hsra.application.service.service.persistence.impl.constants.HSRA_APPLICATION_FORMPersistenceConstants;

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
 * The persistence implementation for the sources detail add service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = SourcesDetailAddPersistence.class)
public class SourcesDetailAddPersistenceImpl
	extends BasePersistenceImpl<SourcesDetailAdd>
	implements SourcesDetailAddPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>SourcesDetailAddUtil</code> to access the sources detail add persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		SourcesDetailAddImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindBygetHsraById;
	private FinderPath _finderPathWithoutPaginationFindBygetHsraById;
	private FinderPath _finderPathCountBygetHsraById;

	/**
	 * Returns all the sources detail adds where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching sources detail adds
	 */
	@Override
	public List<SourcesDetailAdd> findBygetHsraById(long hsraApplicationId) {
		return findBygetHsraById(
			hsraApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sources detail adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SourcesDetailAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of sources detail adds
	 * @param end the upper bound of the range of sources detail adds (not inclusive)
	 * @return the range of matching sources detail adds
	 */
	@Override
	public List<SourcesDetailAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end) {

		return findBygetHsraById(hsraApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the sources detail adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SourcesDetailAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of sources detail adds
	 * @param end the upper bound of the range of sources detail adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sources detail adds
	 */
	@Override
	public List<SourcesDetailAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end,
		OrderByComparator<SourcesDetailAdd> orderByComparator) {

		return findBygetHsraById(
			hsraApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sources detail adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SourcesDetailAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of sources detail adds
	 * @param end the upper bound of the range of sources detail adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sources detail adds
	 */
	@Override
	public List<SourcesDetailAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end,
		OrderByComparator<SourcesDetailAdd> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetHsraById;
				finderArgs = new Object[] {hsraApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetHsraById;
			finderArgs = new Object[] {
				hsraApplicationId, start, end, orderByComparator
			};
		}

		List<SourcesDetailAdd> list = null;

		if (useFinderCache) {
			list = (List<SourcesDetailAdd>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (SourcesDetailAdd sourcesDetailAdd : list) {
					if (hsraApplicationId !=
							sourcesDetailAdd.getHsraApplicationId()) {

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

			sb.append(_SQL_SELECT_SOURCESDETAILADD_WHERE);

			sb.append(_FINDER_COLUMN_GETHSRABYID_HSRAAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(SourcesDetailAddModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(hsraApplicationId);

				list = (List<SourcesDetailAdd>)QueryUtil.list(
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
	 * Returns the first sources detail add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sources detail add
	 * @throws NoSuchSourcesDetailAddException if a matching sources detail add could not be found
	 */
	@Override
	public SourcesDetailAdd findBygetHsraById_First(
			long hsraApplicationId,
			OrderByComparator<SourcesDetailAdd> orderByComparator)
		throws NoSuchSourcesDetailAddException {

		SourcesDetailAdd sourcesDetailAdd = fetchBygetHsraById_First(
			hsraApplicationId, orderByComparator);

		if (sourcesDetailAdd != null) {
			return sourcesDetailAdd;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("hsraApplicationId=");
		sb.append(hsraApplicationId);

		sb.append("}");

		throw new NoSuchSourcesDetailAddException(sb.toString());
	}

	/**
	 * Returns the first sources detail add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sources detail add, or <code>null</code> if a matching sources detail add could not be found
	 */
	@Override
	public SourcesDetailAdd fetchBygetHsraById_First(
		long hsraApplicationId,
		OrderByComparator<SourcesDetailAdd> orderByComparator) {

		List<SourcesDetailAdd> list = findBygetHsraById(
			hsraApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last sources detail add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sources detail add
	 * @throws NoSuchSourcesDetailAddException if a matching sources detail add could not be found
	 */
	@Override
	public SourcesDetailAdd findBygetHsraById_Last(
			long hsraApplicationId,
			OrderByComparator<SourcesDetailAdd> orderByComparator)
		throws NoSuchSourcesDetailAddException {

		SourcesDetailAdd sourcesDetailAdd = fetchBygetHsraById_Last(
			hsraApplicationId, orderByComparator);

		if (sourcesDetailAdd != null) {
			return sourcesDetailAdd;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("hsraApplicationId=");
		sb.append(hsraApplicationId);

		sb.append("}");

		throw new NoSuchSourcesDetailAddException(sb.toString());
	}

	/**
	 * Returns the last sources detail add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sources detail add, or <code>null</code> if a matching sources detail add could not be found
	 */
	@Override
	public SourcesDetailAdd fetchBygetHsraById_Last(
		long hsraApplicationId,
		OrderByComparator<SourcesDetailAdd> orderByComparator) {

		int count = countBygetHsraById(hsraApplicationId);

		if (count == 0) {
			return null;
		}

		List<SourcesDetailAdd> list = findBygetHsraById(
			hsraApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the sources detail adds before and after the current sources detail add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param sourcesDetailAddId the primary key of the current sources detail add
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sources detail add
	 * @throws NoSuchSourcesDetailAddException if a sources detail add with the primary key could not be found
	 */
	@Override
	public SourcesDetailAdd[] findBygetHsraById_PrevAndNext(
			long sourcesDetailAddId, long hsraApplicationId,
			OrderByComparator<SourcesDetailAdd> orderByComparator)
		throws NoSuchSourcesDetailAddException {

		SourcesDetailAdd sourcesDetailAdd = findByPrimaryKey(
			sourcesDetailAddId);

		Session session = null;

		try {
			session = openSession();

			SourcesDetailAdd[] array = new SourcesDetailAddImpl[3];

			array[0] = getBygetHsraById_PrevAndNext(
				session, sourcesDetailAdd, hsraApplicationId, orderByComparator,
				true);

			array[1] = sourcesDetailAdd;

			array[2] = getBygetHsraById_PrevAndNext(
				session, sourcesDetailAdd, hsraApplicationId, orderByComparator,
				false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected SourcesDetailAdd getBygetHsraById_PrevAndNext(
		Session session, SourcesDetailAdd sourcesDetailAdd,
		long hsraApplicationId,
		OrderByComparator<SourcesDetailAdd> orderByComparator,
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

		sb.append(_SQL_SELECT_SOURCESDETAILADD_WHERE);

		sb.append(_FINDER_COLUMN_GETHSRABYID_HSRAAPPLICATIONID_2);

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
			sb.append(SourcesDetailAddModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(hsraApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						sourcesDetailAdd)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<SourcesDetailAdd> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the sources detail adds where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 */
	@Override
	public void removeBygetHsraById(long hsraApplicationId) {
		for (SourcesDetailAdd sourcesDetailAdd :
				findBygetHsraById(
					hsraApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(sourcesDetailAdd);
		}
	}

	/**
	 * Returns the number of sources detail adds where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching sources detail adds
	 */
	@Override
	public int countBygetHsraById(long hsraApplicationId) {
		FinderPath finderPath = _finderPathCountBygetHsraById;

		Object[] finderArgs = new Object[] {hsraApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SOURCESDETAILADD_WHERE);

			sb.append(_FINDER_COLUMN_GETHSRABYID_HSRAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(hsraApplicationId);

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

	private static final String _FINDER_COLUMN_GETHSRABYID_HSRAAPPLICATIONID_2 =
		"sourcesDetailAdd.hsraApplicationId = ?";

	public SourcesDetailAddPersistenceImpl() {
		setModelClass(SourcesDetailAdd.class);

		setModelImplClass(SourcesDetailAddImpl.class);
		setModelPKClass(long.class);

		setTable(SourcesDetailAddTable.INSTANCE);
	}

	/**
	 * Caches the sources detail add in the entity cache if it is enabled.
	 *
	 * @param sourcesDetailAdd the sources detail add
	 */
	@Override
	public void cacheResult(SourcesDetailAdd sourcesDetailAdd) {
		entityCache.putResult(
			SourcesDetailAddImpl.class, sourcesDetailAdd.getPrimaryKey(),
			sourcesDetailAdd);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the sources detail adds in the entity cache if it is enabled.
	 *
	 * @param sourcesDetailAdds the sources detail adds
	 */
	@Override
	public void cacheResult(List<SourcesDetailAdd> sourcesDetailAdds) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (sourcesDetailAdds.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (SourcesDetailAdd sourcesDetailAdd : sourcesDetailAdds) {
			if (entityCache.getResult(
					SourcesDetailAddImpl.class,
					sourcesDetailAdd.getPrimaryKey()) == null) {

				cacheResult(sourcesDetailAdd);
			}
		}
	}

	/**
	 * Clears the cache for all sources detail adds.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(SourcesDetailAddImpl.class);

		finderCache.clearCache(SourcesDetailAddImpl.class);
	}

	/**
	 * Clears the cache for the sources detail add.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(SourcesDetailAdd sourcesDetailAdd) {
		entityCache.removeResult(SourcesDetailAddImpl.class, sourcesDetailAdd);
	}

	@Override
	public void clearCache(List<SourcesDetailAdd> sourcesDetailAdds) {
		for (SourcesDetailAdd sourcesDetailAdd : sourcesDetailAdds) {
			entityCache.removeResult(
				SourcesDetailAddImpl.class, sourcesDetailAdd);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(SourcesDetailAddImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(SourcesDetailAddImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new sources detail add with the primary key. Does not add the sources detail add to the database.
	 *
	 * @param sourcesDetailAddId the primary key for the new sources detail add
	 * @return the new sources detail add
	 */
	@Override
	public SourcesDetailAdd create(long sourcesDetailAddId) {
		SourcesDetailAdd sourcesDetailAdd = new SourcesDetailAddImpl();

		sourcesDetailAdd.setNew(true);
		sourcesDetailAdd.setPrimaryKey(sourcesDetailAddId);

		sourcesDetailAdd.setCompanyId(CompanyThreadLocal.getCompanyId());

		return sourcesDetailAdd;
	}

	/**
	 * Removes the sources detail add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sourcesDetailAddId the primary key of the sources detail add
	 * @return the sources detail add that was removed
	 * @throws NoSuchSourcesDetailAddException if a sources detail add with the primary key could not be found
	 */
	@Override
	public SourcesDetailAdd remove(long sourcesDetailAddId)
		throws NoSuchSourcesDetailAddException {

		return remove((Serializable)sourcesDetailAddId);
	}

	/**
	 * Removes the sources detail add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the sources detail add
	 * @return the sources detail add that was removed
	 * @throws NoSuchSourcesDetailAddException if a sources detail add with the primary key could not be found
	 */
	@Override
	public SourcesDetailAdd remove(Serializable primaryKey)
		throws NoSuchSourcesDetailAddException {

		Session session = null;

		try {
			session = openSession();

			SourcesDetailAdd sourcesDetailAdd = (SourcesDetailAdd)session.get(
				SourcesDetailAddImpl.class, primaryKey);

			if (sourcesDetailAdd == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSourcesDetailAddException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(sourcesDetailAdd);
		}
		catch (NoSuchSourcesDetailAddException noSuchEntityException) {
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
	protected SourcesDetailAdd removeImpl(SourcesDetailAdd sourcesDetailAdd) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(sourcesDetailAdd)) {
				sourcesDetailAdd = (SourcesDetailAdd)session.get(
					SourcesDetailAddImpl.class,
					sourcesDetailAdd.getPrimaryKeyObj());
			}

			if (sourcesDetailAdd != null) {
				session.delete(sourcesDetailAdd);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (sourcesDetailAdd != null) {
			clearCache(sourcesDetailAdd);
		}

		return sourcesDetailAdd;
	}

	@Override
	public SourcesDetailAdd updateImpl(SourcesDetailAdd sourcesDetailAdd) {
		boolean isNew = sourcesDetailAdd.isNew();

		if (!(sourcesDetailAdd instanceof SourcesDetailAddModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(sourcesDetailAdd.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					sourcesDetailAdd);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in sourcesDetailAdd proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom SourcesDetailAdd implementation " +
					sourcesDetailAdd.getClass());
		}

		SourcesDetailAddModelImpl sourcesDetailAddModelImpl =
			(SourcesDetailAddModelImpl)sourcesDetailAdd;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (sourcesDetailAdd.getCreateDate() == null)) {
			if (serviceContext == null) {
				sourcesDetailAdd.setCreateDate(date);
			}
			else {
				sourcesDetailAdd.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!sourcesDetailAddModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				sourcesDetailAdd.setModifiedDate(date);
			}
			else {
				sourcesDetailAdd.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(sourcesDetailAdd);
			}
			else {
				sourcesDetailAdd = (SourcesDetailAdd)session.merge(
					sourcesDetailAdd);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			SourcesDetailAddImpl.class, sourcesDetailAddModelImpl, false, true);

		if (isNew) {
			sourcesDetailAdd.setNew(false);
		}

		sourcesDetailAdd.resetOriginalValues();

		return sourcesDetailAdd;
	}

	/**
	 * Returns the sources detail add with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the sources detail add
	 * @return the sources detail add
	 * @throws NoSuchSourcesDetailAddException if a sources detail add with the primary key could not be found
	 */
	@Override
	public SourcesDetailAdd findByPrimaryKey(Serializable primaryKey)
		throws NoSuchSourcesDetailAddException {

		SourcesDetailAdd sourcesDetailAdd = fetchByPrimaryKey(primaryKey);

		if (sourcesDetailAdd == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSourcesDetailAddException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return sourcesDetailAdd;
	}

	/**
	 * Returns the sources detail add with the primary key or throws a <code>NoSuchSourcesDetailAddException</code> if it could not be found.
	 *
	 * @param sourcesDetailAddId the primary key of the sources detail add
	 * @return the sources detail add
	 * @throws NoSuchSourcesDetailAddException if a sources detail add with the primary key could not be found
	 */
	@Override
	public SourcesDetailAdd findByPrimaryKey(long sourcesDetailAddId)
		throws NoSuchSourcesDetailAddException {

		return findByPrimaryKey((Serializable)sourcesDetailAddId);
	}

	/**
	 * Returns the sources detail add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sourcesDetailAddId the primary key of the sources detail add
	 * @return the sources detail add, or <code>null</code> if a sources detail add with the primary key could not be found
	 */
	@Override
	public SourcesDetailAdd fetchByPrimaryKey(long sourcesDetailAddId) {
		return fetchByPrimaryKey((Serializable)sourcesDetailAddId);
	}

	/**
	 * Returns all the sources detail adds.
	 *
	 * @return the sources detail adds
	 */
	@Override
	public List<SourcesDetailAdd> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sources detail adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SourcesDetailAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sources detail adds
	 * @param end the upper bound of the range of sources detail adds (not inclusive)
	 * @return the range of sources detail adds
	 */
	@Override
	public List<SourcesDetailAdd> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the sources detail adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SourcesDetailAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sources detail adds
	 * @param end the upper bound of the range of sources detail adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sources detail adds
	 */
	@Override
	public List<SourcesDetailAdd> findAll(
		int start, int end,
		OrderByComparator<SourcesDetailAdd> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sources detail adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SourcesDetailAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sources detail adds
	 * @param end the upper bound of the range of sources detail adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sources detail adds
	 */
	@Override
	public List<SourcesDetailAdd> findAll(
		int start, int end,
		OrderByComparator<SourcesDetailAdd> orderByComparator,
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

		List<SourcesDetailAdd> list = null;

		if (useFinderCache) {
			list = (List<SourcesDetailAdd>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_SOURCESDETAILADD);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_SOURCESDETAILADD;

				sql = sql.concat(SourcesDetailAddModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<SourcesDetailAdd>)QueryUtil.list(
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
	 * Removes all the sources detail adds from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (SourcesDetailAdd sourcesDetailAdd : findAll()) {
			remove(sourcesDetailAdd);
		}
	}

	/**
	 * Returns the number of sources detail adds.
	 *
	 * @return the number of sources detail adds
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_SOURCESDETAILADD);

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
		return "sourcesDetailAddId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_SOURCESDETAILADD;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return SourcesDetailAddModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the sources detail add persistence.
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

		_finderPathWithPaginationFindBygetHsraById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetHsraById",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"hsraApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetHsraById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetHsraById",
			new String[] {Long.class.getName()},
			new String[] {"hsraApplicationId"}, true);

		_finderPathCountBygetHsraById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetHsraById",
			new String[] {Long.class.getName()},
			new String[] {"hsraApplicationId"}, false);

		SourcesDetailAddUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		SourcesDetailAddUtil.setPersistence(null);

		entityCache.removeCache(SourcesDetailAddImpl.class.getName());
	}

	@Override
	@Reference(
		target = HSRA_APPLICATION_FORMPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = HSRA_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = HSRA_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_SOURCESDETAILADD =
		"SELECT sourcesDetailAdd FROM SourcesDetailAdd sourcesDetailAdd";

	private static final String _SQL_SELECT_SOURCESDETAILADD_WHERE =
		"SELECT sourcesDetailAdd FROM SourcesDetailAdd sourcesDetailAdd WHERE ";

	private static final String _SQL_COUNT_SOURCESDETAILADD =
		"SELECT COUNT(sourcesDetailAdd) FROM SourcesDetailAdd sourcesDetailAdd";

	private static final String _SQL_COUNT_SOURCESDETAILADD_WHERE =
		"SELECT COUNT(sourcesDetailAdd) FROM SourcesDetailAdd sourcesDetailAdd WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "sourcesDetailAdd.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No SourcesDetailAdd exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No SourcesDetailAdd exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		SourcesDetailAddPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}