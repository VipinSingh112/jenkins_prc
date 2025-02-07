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
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;

import com.nbp.osi.insolvency.application.form.services.exception.NoSuchShareholdersHoldingsException;
import com.nbp.osi.insolvency.application.form.services.model.ShareholdersHoldings;
import com.nbp.osi.insolvency.application.form.services.model.ShareholdersHoldingsTable;
import com.nbp.osi.insolvency.application.form.services.model.impl.ShareholdersHoldingsImpl;
import com.nbp.osi.insolvency.application.form.services.model.impl.ShareholdersHoldingsModelImpl;
import com.nbp.osi.insolvency.application.form.services.service.persistence.ShareholdersHoldingsPersistence;
import com.nbp.osi.insolvency.application.form.services.service.persistence.ShareholdersHoldingsUtil;
import com.nbp.osi.insolvency.application.form.services.service.persistence.impl.constants.OSI_INSOLVENCYPersistenceConstants;

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
 * The persistence implementation for the shareholders holdings service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = ShareholdersHoldingsPersistence.class)
public class ShareholdersHoldingsPersistenceImpl
	extends BasePersistenceImpl<ShareholdersHoldings>
	implements ShareholdersHoldingsPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>ShareholdersHoldingsUtil</code> to access the shareholders holdings persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		ShareholdersHoldingsImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindBygetOsiById;
	private FinderPath _finderPathWithoutPaginationFindBygetOsiById;
	private FinderPath _finderPathCountBygetOsiById;

	/**
	 * Returns all the shareholders holdingses where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching shareholders holdingses
	 */
	@Override
	public List<ShareholdersHoldings> findBygetOsiById(long osiInsolvencyId) {
		return findBygetOsiById(
			osiInsolvencyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the shareholders holdingses where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ShareholdersHoldingsModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of shareholders holdingses
	 * @param end the upper bound of the range of shareholders holdingses (not inclusive)
	 * @return the range of matching shareholders holdingses
	 */
	@Override
	public List<ShareholdersHoldings> findBygetOsiById(
		long osiInsolvencyId, int start, int end) {

		return findBygetOsiById(osiInsolvencyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the shareholders holdingses where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ShareholdersHoldingsModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of shareholders holdingses
	 * @param end the upper bound of the range of shareholders holdingses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching shareholders holdingses
	 */
	@Override
	public List<ShareholdersHoldings> findBygetOsiById(
		long osiInsolvencyId, int start, int end,
		OrderByComparator<ShareholdersHoldings> orderByComparator) {

		return findBygetOsiById(
			osiInsolvencyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the shareholders holdingses where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ShareholdersHoldingsModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of shareholders holdingses
	 * @param end the upper bound of the range of shareholders holdingses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching shareholders holdingses
	 */
	@Override
	public List<ShareholdersHoldings> findBygetOsiById(
		long osiInsolvencyId, int start, int end,
		OrderByComparator<ShareholdersHoldings> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetOsiById;
				finderArgs = new Object[] {osiInsolvencyId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetOsiById;
			finderArgs = new Object[] {
				osiInsolvencyId, start, end, orderByComparator
			};
		}

		List<ShareholdersHoldings> list = null;

		if (useFinderCache) {
			list = (List<ShareholdersHoldings>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ShareholdersHoldings shareholdersHoldings : list) {
					if (osiInsolvencyId !=
							shareholdersHoldings.getOsiInsolvencyId()) {

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

			sb.append(_SQL_SELECT_SHAREHOLDERSHOLDINGS_WHERE);

			sb.append(_FINDER_COLUMN_GETOSIBYID_OSIINSOLVENCYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(ShareholdersHoldingsModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiInsolvencyId);

				list = (List<ShareholdersHoldings>)QueryUtil.list(
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
	 * Returns the first shareholders holdings in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching shareholders holdings
	 * @throws NoSuchShareholdersHoldingsException if a matching shareholders holdings could not be found
	 */
	@Override
	public ShareholdersHoldings findBygetOsiById_First(
			long osiInsolvencyId,
			OrderByComparator<ShareholdersHoldings> orderByComparator)
		throws NoSuchShareholdersHoldingsException {

		ShareholdersHoldings shareholdersHoldings = fetchBygetOsiById_First(
			osiInsolvencyId, orderByComparator);

		if (shareholdersHoldings != null) {
			return shareholdersHoldings;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("osiInsolvencyId=");
		sb.append(osiInsolvencyId);

		sb.append("}");

		throw new NoSuchShareholdersHoldingsException(sb.toString());
	}

	/**
	 * Returns the first shareholders holdings in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching shareholders holdings, or <code>null</code> if a matching shareholders holdings could not be found
	 */
	@Override
	public ShareholdersHoldings fetchBygetOsiById_First(
		long osiInsolvencyId,
		OrderByComparator<ShareholdersHoldings> orderByComparator) {

		List<ShareholdersHoldings> list = findBygetOsiById(
			osiInsolvencyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last shareholders holdings in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching shareholders holdings
	 * @throws NoSuchShareholdersHoldingsException if a matching shareholders holdings could not be found
	 */
	@Override
	public ShareholdersHoldings findBygetOsiById_Last(
			long osiInsolvencyId,
			OrderByComparator<ShareholdersHoldings> orderByComparator)
		throws NoSuchShareholdersHoldingsException {

		ShareholdersHoldings shareholdersHoldings = fetchBygetOsiById_Last(
			osiInsolvencyId, orderByComparator);

		if (shareholdersHoldings != null) {
			return shareholdersHoldings;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("osiInsolvencyId=");
		sb.append(osiInsolvencyId);

		sb.append("}");

		throw new NoSuchShareholdersHoldingsException(sb.toString());
	}

	/**
	 * Returns the last shareholders holdings in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching shareholders holdings, or <code>null</code> if a matching shareholders holdings could not be found
	 */
	@Override
	public ShareholdersHoldings fetchBygetOsiById_Last(
		long osiInsolvencyId,
		OrderByComparator<ShareholdersHoldings> orderByComparator) {

		int count = countBygetOsiById(osiInsolvencyId);

		if (count == 0) {
			return null;
		}

		List<ShareholdersHoldings> list = findBygetOsiById(
			osiInsolvencyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the shareholders holdingses before and after the current shareholders holdings in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param shareholdersHoldingsId the primary key of the current shareholders holdings
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next shareholders holdings
	 * @throws NoSuchShareholdersHoldingsException if a shareholders holdings with the primary key could not be found
	 */
	@Override
	public ShareholdersHoldings[] findBygetOsiById_PrevAndNext(
			long shareholdersHoldingsId, long osiInsolvencyId,
			OrderByComparator<ShareholdersHoldings> orderByComparator)
		throws NoSuchShareholdersHoldingsException {

		ShareholdersHoldings shareholdersHoldings = findByPrimaryKey(
			shareholdersHoldingsId);

		Session session = null;

		try {
			session = openSession();

			ShareholdersHoldings[] array = new ShareholdersHoldingsImpl[3];

			array[0] = getBygetOsiById_PrevAndNext(
				session, shareholdersHoldings, osiInsolvencyId,
				orderByComparator, true);

			array[1] = shareholdersHoldings;

			array[2] = getBygetOsiById_PrevAndNext(
				session, shareholdersHoldings, osiInsolvencyId,
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

	protected ShareholdersHoldings getBygetOsiById_PrevAndNext(
		Session session, ShareholdersHoldings shareholdersHoldings,
		long osiInsolvencyId,
		OrderByComparator<ShareholdersHoldings> orderByComparator,
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

		sb.append(_SQL_SELECT_SHAREHOLDERSHOLDINGS_WHERE);

		sb.append(_FINDER_COLUMN_GETOSIBYID_OSIINSOLVENCYID_2);

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
			sb.append(ShareholdersHoldingsModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(osiInsolvencyId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						shareholdersHoldings)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<ShareholdersHoldings> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the shareholders holdingses where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 */
	@Override
	public void removeBygetOsiById(long osiInsolvencyId) {
		for (ShareholdersHoldings shareholdersHoldings :
				findBygetOsiById(
					osiInsolvencyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(shareholdersHoldings);
		}
	}

	/**
	 * Returns the number of shareholders holdingses where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching shareholders holdingses
	 */
	@Override
	public int countBygetOsiById(long osiInsolvencyId) {
		FinderPath finderPath = _finderPathCountBygetOsiById;

		Object[] finderArgs = new Object[] {osiInsolvencyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SHAREHOLDERSHOLDINGS_WHERE);

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
		"shareholdersHoldings.osiInsolvencyId = ?";

	public ShareholdersHoldingsPersistenceImpl() {
		setModelClass(ShareholdersHoldings.class);

		setModelImplClass(ShareholdersHoldingsImpl.class);
		setModelPKClass(long.class);

		setTable(ShareholdersHoldingsTable.INSTANCE);
	}

	/**
	 * Caches the shareholders holdings in the entity cache if it is enabled.
	 *
	 * @param shareholdersHoldings the shareholders holdings
	 */
	@Override
	public void cacheResult(ShareholdersHoldings shareholdersHoldings) {
		entityCache.putResult(
			ShareholdersHoldingsImpl.class,
			shareholdersHoldings.getPrimaryKey(), shareholdersHoldings);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the shareholders holdingses in the entity cache if it is enabled.
	 *
	 * @param shareholdersHoldingses the shareholders holdingses
	 */
	@Override
	public void cacheResult(List<ShareholdersHoldings> shareholdersHoldingses) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (shareholdersHoldingses.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (ShareholdersHoldings shareholdersHoldings :
				shareholdersHoldingses) {

			if (entityCache.getResult(
					ShareholdersHoldingsImpl.class,
					shareholdersHoldings.getPrimaryKey()) == null) {

				cacheResult(shareholdersHoldings);
			}
		}
	}

	/**
	 * Clears the cache for all shareholders holdingses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ShareholdersHoldingsImpl.class);

		finderCache.clearCache(ShareholdersHoldingsImpl.class);
	}

	/**
	 * Clears the cache for the shareholders holdings.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ShareholdersHoldings shareholdersHoldings) {
		entityCache.removeResult(
			ShareholdersHoldingsImpl.class, shareholdersHoldings);
	}

	@Override
	public void clearCache(List<ShareholdersHoldings> shareholdersHoldingses) {
		for (ShareholdersHoldings shareholdersHoldings :
				shareholdersHoldingses) {

			entityCache.removeResult(
				ShareholdersHoldingsImpl.class, shareholdersHoldings);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(ShareholdersHoldingsImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				ShareholdersHoldingsImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new shareholders holdings with the primary key. Does not add the shareholders holdings to the database.
	 *
	 * @param shareholdersHoldingsId the primary key for the new shareholders holdings
	 * @return the new shareholders holdings
	 */
	@Override
	public ShareholdersHoldings create(long shareholdersHoldingsId) {
		ShareholdersHoldings shareholdersHoldings =
			new ShareholdersHoldingsImpl();

		shareholdersHoldings.setNew(true);
		shareholdersHoldings.setPrimaryKey(shareholdersHoldingsId);

		shareholdersHoldings.setCompanyId(CompanyThreadLocal.getCompanyId());

		return shareholdersHoldings;
	}

	/**
	 * Removes the shareholders holdings with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param shareholdersHoldingsId the primary key of the shareholders holdings
	 * @return the shareholders holdings that was removed
	 * @throws NoSuchShareholdersHoldingsException if a shareholders holdings with the primary key could not be found
	 */
	@Override
	public ShareholdersHoldings remove(long shareholdersHoldingsId)
		throws NoSuchShareholdersHoldingsException {

		return remove((Serializable)shareholdersHoldingsId);
	}

	/**
	 * Removes the shareholders holdings with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the shareholders holdings
	 * @return the shareholders holdings that was removed
	 * @throws NoSuchShareholdersHoldingsException if a shareholders holdings with the primary key could not be found
	 */
	@Override
	public ShareholdersHoldings remove(Serializable primaryKey)
		throws NoSuchShareholdersHoldingsException {

		Session session = null;

		try {
			session = openSession();

			ShareholdersHoldings shareholdersHoldings =
				(ShareholdersHoldings)session.get(
					ShareholdersHoldingsImpl.class, primaryKey);

			if (shareholdersHoldings == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchShareholdersHoldingsException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(shareholdersHoldings);
		}
		catch (NoSuchShareholdersHoldingsException noSuchEntityException) {
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
	protected ShareholdersHoldings removeImpl(
		ShareholdersHoldings shareholdersHoldings) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(shareholdersHoldings)) {
				shareholdersHoldings = (ShareholdersHoldings)session.get(
					ShareholdersHoldingsImpl.class,
					shareholdersHoldings.getPrimaryKeyObj());
			}

			if (shareholdersHoldings != null) {
				session.delete(shareholdersHoldings);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (shareholdersHoldings != null) {
			clearCache(shareholdersHoldings);
		}

		return shareholdersHoldings;
	}

	@Override
	public ShareholdersHoldings updateImpl(
		ShareholdersHoldings shareholdersHoldings) {

		boolean isNew = shareholdersHoldings.isNew();

		if (!(shareholdersHoldings instanceof ShareholdersHoldingsModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(shareholdersHoldings.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					shareholdersHoldings);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in shareholdersHoldings proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom ShareholdersHoldings implementation " +
					shareholdersHoldings.getClass());
		}

		ShareholdersHoldingsModelImpl shareholdersHoldingsModelImpl =
			(ShareholdersHoldingsModelImpl)shareholdersHoldings;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (shareholdersHoldings.getCreateDate() == null)) {
			if (serviceContext == null) {
				shareholdersHoldings.setCreateDate(date);
			}
			else {
				shareholdersHoldings.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!shareholdersHoldingsModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				shareholdersHoldings.setModifiedDate(date);
			}
			else {
				shareholdersHoldings.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(shareholdersHoldings);
			}
			else {
				shareholdersHoldings = (ShareholdersHoldings)session.merge(
					shareholdersHoldings);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			ShareholdersHoldingsImpl.class, shareholdersHoldingsModelImpl,
			false, true);

		if (isNew) {
			shareholdersHoldings.setNew(false);
		}

		shareholdersHoldings.resetOriginalValues();

		return shareholdersHoldings;
	}

	/**
	 * Returns the shareholders holdings with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the shareholders holdings
	 * @return the shareholders holdings
	 * @throws NoSuchShareholdersHoldingsException if a shareholders holdings with the primary key could not be found
	 */
	@Override
	public ShareholdersHoldings findByPrimaryKey(Serializable primaryKey)
		throws NoSuchShareholdersHoldingsException {

		ShareholdersHoldings shareholdersHoldings = fetchByPrimaryKey(
			primaryKey);

		if (shareholdersHoldings == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchShareholdersHoldingsException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return shareholdersHoldings;
	}

	/**
	 * Returns the shareholders holdings with the primary key or throws a <code>NoSuchShareholdersHoldingsException</code> if it could not be found.
	 *
	 * @param shareholdersHoldingsId the primary key of the shareholders holdings
	 * @return the shareholders holdings
	 * @throws NoSuchShareholdersHoldingsException if a shareholders holdings with the primary key could not be found
	 */
	@Override
	public ShareholdersHoldings findByPrimaryKey(long shareholdersHoldingsId)
		throws NoSuchShareholdersHoldingsException {

		return findByPrimaryKey((Serializable)shareholdersHoldingsId);
	}

	/**
	 * Returns the shareholders holdings with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param shareholdersHoldingsId the primary key of the shareholders holdings
	 * @return the shareholders holdings, or <code>null</code> if a shareholders holdings with the primary key could not be found
	 */
	@Override
	public ShareholdersHoldings fetchByPrimaryKey(long shareholdersHoldingsId) {
		return fetchByPrimaryKey((Serializable)shareholdersHoldingsId);
	}

	/**
	 * Returns all the shareholders holdingses.
	 *
	 * @return the shareholders holdingses
	 */
	@Override
	public List<ShareholdersHoldings> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the shareholders holdingses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ShareholdersHoldingsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of shareholders holdingses
	 * @param end the upper bound of the range of shareholders holdingses (not inclusive)
	 * @return the range of shareholders holdingses
	 */
	@Override
	public List<ShareholdersHoldings> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the shareholders holdingses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ShareholdersHoldingsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of shareholders holdingses
	 * @param end the upper bound of the range of shareholders holdingses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of shareholders holdingses
	 */
	@Override
	public List<ShareholdersHoldings> findAll(
		int start, int end,
		OrderByComparator<ShareholdersHoldings> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the shareholders holdingses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ShareholdersHoldingsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of shareholders holdingses
	 * @param end the upper bound of the range of shareholders holdingses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of shareholders holdingses
	 */
	@Override
	public List<ShareholdersHoldings> findAll(
		int start, int end,
		OrderByComparator<ShareholdersHoldings> orderByComparator,
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

		List<ShareholdersHoldings> list = null;

		if (useFinderCache) {
			list = (List<ShareholdersHoldings>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_SHAREHOLDERSHOLDINGS);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_SHAREHOLDERSHOLDINGS;

				sql = sql.concat(ShareholdersHoldingsModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<ShareholdersHoldings>)QueryUtil.list(
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
	 * Removes all the shareholders holdingses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (ShareholdersHoldings shareholdersHoldings : findAll()) {
			remove(shareholdersHoldings);
		}
	}

	/**
	 * Returns the number of shareholders holdingses.
	 *
	 * @return the number of shareholders holdingses
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
					_SQL_COUNT_SHAREHOLDERSHOLDINGS);

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
		return "shareholdersHoldingsId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_SHAREHOLDERSHOLDINGS;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return ShareholdersHoldingsModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the shareholders holdings persistence.
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

		_finderPathWithPaginationFindBygetOsiById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetOsiById",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"osiInsolvencyId"}, true);

		_finderPathWithoutPaginationFindBygetOsiById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetOsiById",
			new String[] {Long.class.getName()},
			new String[] {"osiInsolvencyId"}, true);

		_finderPathCountBygetOsiById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetOsiById",
			new String[] {Long.class.getName()},
			new String[] {"osiInsolvencyId"}, false);

		ShareholdersHoldingsUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		ShareholdersHoldingsUtil.setPersistence(null);

		entityCache.removeCache(ShareholdersHoldingsImpl.class.getName());
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

	private static final String _SQL_SELECT_SHAREHOLDERSHOLDINGS =
		"SELECT shareholdersHoldings FROM ShareholdersHoldings shareholdersHoldings";

	private static final String _SQL_SELECT_SHAREHOLDERSHOLDINGS_WHERE =
		"SELECT shareholdersHoldings FROM ShareholdersHoldings shareholdersHoldings WHERE ";

	private static final String _SQL_COUNT_SHAREHOLDERSHOLDINGS =
		"SELECT COUNT(shareholdersHoldings) FROM ShareholdersHoldings shareholdersHoldings";

	private static final String _SQL_COUNT_SHAREHOLDERSHOLDINGS_WHERE =
		"SELECT COUNT(shareholdersHoldings) FROM ShareholdersHoldings shareholdersHoldings WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"shareholdersHoldings.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No ShareholdersHoldings exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No ShareholdersHoldings exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		ShareholdersHoldingsPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}